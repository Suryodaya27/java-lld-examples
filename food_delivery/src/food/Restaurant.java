package food;

import java.util.ArrayList;

public class Restaurant {
    private int restaurantId;
    private String name;
    private String address;
    private String phoneNumber;
    private ArrayList<Food> menu;

    public Restaurant(int restaurantId, String name, String address, String phoneNumber) {
        this.restaurantId = restaurantId;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.menu = new ArrayList<>();
        // add food items to the menu
        menu.add(new Food(1, "Burger", 5.99));
        menu.add(new Food(2, "Fries", 2.99));
        menu.add(new Food(3, "Soda", 1.99));
        
    }

    public int getRestaurantId() {
        return restaurantId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public ArrayList<Food> getFoodItems() {
        return menu;
    }

    public void addFoodItem(Food food) {
        menu.add(food);
    }

    public void orderFood(ArrayList<Food> foods) {
        // Implement logic to process the order
        System.out.println("Food ordered: " + foods);
    }
}
