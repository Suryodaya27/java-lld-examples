package food;

import java.util.HashMap;
import java.util.ArrayList;

public class RestaurantManager {
    private static RestaurantManager instance = null;
    private HashMap<Integer, Restaurant> restaurantMap = new HashMap<>();

    private RestaurantManager() {
        restaurantMap.put(1, new Restaurant(1, "McDonalds", "1234 Main St", "123-456-7890"));
        restaurantMap.put(2, new Restaurant(2, "Burger King", "5678 Main St", "123-456-7890"));
        restaurantMap.put(3, new Restaurant(3, "Wendy's", "9101 Main St", "123-456-7890"));
    }

    public static RestaurantManager getInstance() {
        if (instance == null) {
            instance = new RestaurantManager();
        }
        return instance;
    }

    public HashMap<Integer, Restaurant> getAllRestaurants() {
        return restaurantMap;
    }

    public void addFoodItemToRestaurant(int restaurantId, Food food) {
        Restaurant restaurant = restaurantMap.get(restaurantId);
        if (restaurant != null) {
            restaurant.addFoodItem(food);
        } else {
            System.out.println("Restaurant not found.");
        }
    }

    public ArrayList<Food> getFoodItemsByRestaurantId(int restaurantId) {
        Restaurant restaurant = restaurantMap.get(restaurantId);
        return (restaurant != null) ? restaurant.getFoodItems() : null;
    }

    public boolean orderFoodFromRestaurant(int restaurantId, ArrayList<Food> foods) {
        Restaurant restaurant = restaurantMap.get(restaurantId);
        if (restaurant != null) {
            restaurant.orderFood(foods);
            System.out.println("Ordering food from restaurant: " + restaurant.getName());
            return true;
        } else {
            System.out.println("Restaurant not found.");
            return false;
        }
    }
}
