package delivery;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DeliveryManager {
    private static DeliveryManager instance;
    private List<DeliveryPartner> deliveryPartners;

    private DeliveryManager() {
        deliveryPartners = new ArrayList<>();
        // Add some delivery partners
        deliveryPartners.add(new DeliveryPartner(1, "Alice"));
        deliveryPartners.add(new DeliveryPartner(2, "Bob"));
        deliveryPartners.add(new DeliveryPartner(3, "Charlie"));
    }

    public static DeliveryManager getInstance() {
        if (instance == null) {
            instance = new DeliveryManager();
        }
        return instance;
    }

    public DeliveryPartner assignDeliveryPartner() {
        Random random = new Random();
        return deliveryPartners.get(random.nextInt(deliveryPartners.size()));
    }
}
