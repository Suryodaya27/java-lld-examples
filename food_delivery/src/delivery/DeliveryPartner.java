package delivery;

public class DeliveryPartner {
    private int partnerId;
    private String name;

    public DeliveryPartner(int partnerId, String name) {
        this.partnerId = partnerId;
        this.name = name;
    }

    public int getPartnerId() {
        return partnerId;
    }

    public String getName() {
        return name;
    }

    public void receiveOrderDetails(int orderId, String address, double totalPrice) {
        System.out.println(" ");
        System.out.println("Delivery Partner " + name + " assigned to order " + orderId);
        System.out.println("Delivery Address: " + address);
        System.out.println("Total Price: " + totalPrice);
        System.out.println(" ");
    }

    @Override
    public String toString() {
        return "DeliveryPartner [partnerId=" + partnerId + ", name=" + name + "]";
    }
}
