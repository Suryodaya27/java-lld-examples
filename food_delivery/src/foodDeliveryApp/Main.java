package foodDeliveryApp;

import java.util.ArrayList;

import food.*;
import order.*;
import user.*;
// import delivery.*;

public class Main {
    public static void main(String[] args) {
        RestaurantManager restaurantManager = RestaurantManager.getInstance();

        // Get food items from a restaurant
        ArrayList<Food> foods = restaurantManager.getFoodItemsByRestaurantId(1);
        System.out.println(foods);

        // Create a user
        User user = new User(1, "John Doe");

        // Create an order and add the user as an observer
        Order order = new Order(1, 1, foods, "1234 Main St", 5.99, "Ordered", user);

        // Get the instance of OrderManager and add the order
        OrderManager orderManager = OrderManager.getInstance();
        orderManager.addOrder(order);

        // Print all orders
        System.out.println(" ");
        System.out.println(orderManager.getOrders());
    }
}
