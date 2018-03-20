package Salon;

import java.util.ArrayList;
import java.util.Scanner;

public class BeautySalon {
    public static ArrayList<Product> termekek = new ArrayList<>();
    public static ArrayList<Service> szolgaltatasok = new ArrayList<>();

    public static void main(String[] args) {
        boolean endOfProgram = false;

        Product pure = new Product("Pure", 58);
        pure.addProduct(termekek, pure);
        Product bareMinerals = new Product("BareMinerals", 79);
        bareMinerals.addProduct(termekek, bareMinerals);
        Service pedicure = new Service("Pedicure", 100);
        pedicure.addService(szolgaltatasok, pedicure);
        Service manicure = new Service("Manicure", 100);
        manicure.addService(szolgaltatasok, manicure);

        Customer ugyfel = new Customer("Endre", "Gold");
        Visit latogato = new Visit();

        while (!endOfProgram) {
            System.out.println("If you want buy " + pure.getName() + " press 1");
            System.out.println("If you want buy " + bareMinerals.getName() + " press 2");
            System.out.println("If you want to subscribe " + pedicure.getName() + " press 3");
            System.out.println("If you want to subscribe " + manicure.getName() + " press 4");
            System.out.println("If you don't want anything press 5");

            Scanner keyword = new Scanner(System.in);
            int n = keyword.nextInt();

            if (n == 1) {
                printer();
                Scanner keyword2 = new Scanner(System.in);
                char c = keyword2.next().charAt(0);
                if (c == 'y') {
                    customerPrintName(ugyfel);
                    System.out.println("Congratulation you buy a " + pure.getName());
                    System.out.println("This is price  = " + ugyfel.priceProductForCustomer(pure));


                } else {
                    System.out.println("Congratulation you subscribed on the " +pure.getName());
                    System.out.println("This is price  = " + latogato.priceProductForVisit(pure));
                }
            } else if (n == 2) {
                printer();
                Scanner keyword2 = new Scanner(System.in);
                char c = keyword2.next().charAt(0);
                if (c == 'y') {
                    customerPrintName(ugyfel);
                    System.out.println("Congratulation you buy a " + bareMinerals.getName());
                    System.out.println("This is price  = " + ugyfel.priceProductForCustomer(bareMinerals));

                } else {
                    System.out.println("Congratulation you subscribed on the " +bareMinerals.getName());
                    System.out.println("This is price  = " + latogato.priceProductForVisit(bareMinerals));
                }
            } else if (n == 3) {
                printer();
                Scanner keyword2 = new Scanner(System.in);
                char c = keyword2.next().charAt(0);
                if (c == 'y') {
                    customerPrintName(ugyfel);
                    System.out.println("Congratulation you subscribed on the " + pedicure.getName());
                    System.out.println("This is price  = " + ugyfel.priceServiceForCostumer(ugyfel.getType(), pedicure));


                } else {
                    System.out.println("Congratulation you subscribed on the " + pedicure.getName());
                    System.out.println("This is price  = " + latogato.priceServiceForVisit(pedicure));

                }

            } else if (n == 4) {
                printer();
                Scanner keyword2 = new Scanner(System.in);
                char c = keyword2.next().charAt(0);
                if (c == 'y') {
                    customerPrintName(ugyfel);
                    System.out.println("Congratulation you subsribed on the " + manicure.getName());
                    System.out.println("This is price  = " + ugyfel.priceServiceForCostumer(ugyfel.getType(), manicure));


                } else {
                    System.out.println("Congratulation you subsribed on the " + manicure.getName());
                    System.out.println("This is price  = " + latogato.priceServiceForVisit(manicure));


                }
            } else if (n == 5) {
                endOfProgram = true;
            } else {
                System.out.println("Bad character, try again!");
            }
        }
    }

    public static void printer() {
        System.out.println("Are you customer? If yes press 'y', if no press 'n' ");
    }

    public static void customerPrintName(Customer name) {
        System.out.println("Hello " + name.getName()+"!");
    }

}
