package Salon;

public class Customer {
    private static double price = 0;
    private String type;
    private String name;

    public Customer(String name, String type) {
        setName(name);
        setType(type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static double priceServiceForCostumer(String type, Service service) {
        if (type == "Premium") {
            return price = price + (service.getPrice() - 0.2 * service.getPrice());
        } else if (type == "Gold") {
            return price = price + (service.getPrice() - 0.15 * service.getPrice());
        } else {
            return price = price + (service.getPrice() - 0.1 * service.getPrice());
        }
    }

    public static double priceProductForCustomer(Product product) {
        return price = price + (product.getPrice() - (product.getPrice() * 0.1));
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
