package Salon;

import java.util.ArrayList;

public class Service {
    private String name;
    private double price;

    public Service(String name, double price) {
        setName(name);
        setPrice(price);
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

    public static void addService(ArrayList<Service> services, Service service) {
        services.add(service);
    }

    public static void removeService(ArrayList<Service> services, Service service)
    {
        services.remove(service);
    }

}
