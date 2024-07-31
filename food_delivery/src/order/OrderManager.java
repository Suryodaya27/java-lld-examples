package order;

// import food.Food;
import food.RestaurantManager;
import delivery.DeliveryManager;
import delivery.DeliveryPartner;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private static OrderManager instance;
    private List<Order> orders;
    private RestaurantManager restaurantManager;
    private DeliveryManager deliveryManager;

    // Private constructor for singleton pattern
    private OrderManager() {
        orders = new ArrayList<>();
        restaurantManager = RestaurantManager.getInstance();
        deliveryManager = DeliveryManager.getInstance();
    }

    // Singleton instance method
    public static OrderManager getInstance() {
        if (instance == null) {
            instance = new OrderManager();
        }
        return instance;
    }

    // Add a new order and manage its progression
    public void addOrder(Order order) {
        // Set initial status and notify
        System.out.println(" ");
        order.setStatus("Order Placed");
        orders.add(order);
        System.out.println(" ");
        System.out.println("Order placed successfully: " + order);

        // Update status to indicate restaurant received the order
        order.setStatus("Restaurant Received Order");
        boolean isOrdered = restaurantManager.orderFoodFromRestaurant(order.getRestaurantId(), order.getFoods());
        
        if (isOrdered) {
            // Update status to indicate food is preparing
            order.setStatus("Food Preparing");
            
            // Simulate food preparation time
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            // Update status to indicate food is prepared
            order.setStatus("Food Prepared");

            // Assign a delivery partner
            DeliveryPartner deliveryPartner = deliveryManager.assignDeliveryPartner();
            order.setDeliveryPartner(deliveryPartner);
            order.setStatus("Delivery Partner Assigned: " + deliveryPartner.getName());

            // Simulate delivery process
            order.setStatus("Order Out for Delivery");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            order.setStatus("Order Delivered");
        } else {
            System.out.println("Order placement failed.");
        }
    }

    // Retrieve all orders
    public List<Order> getOrders() {
        return orders;
    }
}
