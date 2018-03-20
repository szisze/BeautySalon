package Salon;

public class Visit {
    private static double price = 0;

    public static double priceProductForVisit(Product product) {
        return price = price + product.getPrice();
    }

    public static double priceServiceForVisit(Service service) {
        return price = price + service.getPrice();
    }

}
