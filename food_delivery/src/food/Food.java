package food;

public class Food {

    private int foodId;
    private String foodName;
    private double foodPrice;
    

    Food(int foodId, String foodName, double foodPrice){
        this.foodId = foodId;
        this.foodName = foodName;
        this.foodPrice = foodPrice;
    }

    @Override
    public String toString() {
        return "Food [foodId=" + foodId + ", foodName=" + foodName + ", foodPrice=" + foodPrice + "]";
    }
}
