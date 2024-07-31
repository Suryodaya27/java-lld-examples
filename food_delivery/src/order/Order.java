package order;

import food.Food;
import user.Observer;
import user.User;
import delivery.DeliveryPartner;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private int restaurantId;
    private ArrayList<Food> foods;
    private String address;
    private double totalPrice;
    private String status;
    private List<Observer> observers;
    private User user;
    private DeliveryPartner deliveryPartner;

    public Order(int orderId, int restaurantId, ArrayList<Food> foods, String address, double totalPrice, String status, User user) {
        this.orderId = orderId;
        this.restaurantId = restaurantId;
        this.foods = foods;
        this.address = address;
        this.totalPrice = totalPrice;
        this.status = status;
        this.observers = new ArrayList<>();
        this.user = user;
        addObserver(user); // Add the user as an observer
    }

    public User getUser() {
        return user;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update("Order " + orderId + " status: " + status);
        }
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }

    public void setDeliveryPartner(DeliveryPartner deliveryPartner) {
        this.deliveryPartner = deliveryPartner;
        deliveryPartner.receiveOrderDetails(orderId, address, totalPrice); // Notify delivery partner with details
    }

    public int getOrderId() {
        return orderId;
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public ArrayList<Food> getFoods() {
        return foods;
    }

    public String getAddress() {
        return address;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public DeliveryPartner getDeliveryPartner() {
        return deliveryPartner;
    }

    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", restaurantId=" + restaurantId + ", foods=" + foods + ", address=" + address + ", totalPrice=" + totalPrice + ", status=" + status + ", deliveryPartner=" + deliveryPartner + "]";
    }
}
