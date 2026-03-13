import java.util.Scanner;

public class MovieTicketBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        double originalTotal = 0.0;
        double finalTotal = 0.0;

        for (int i = 1; i <= n; i++) {
            String seatType = sc.next();
            String customerType = sc.next();

            System.out.println("Ticket " + i + ": " + seatType + " - " + customerType);

            double price = 0.0;
            int discount = 0;

            seatType = seatType.toLowerCase();
            customerType = customerType.toLowerCase();

            if (seatType.equals("regular")) {
                price = 12.0;
            } else if (seatType.equals("premium")) {
                price = 18.0;
            } else if (seatType.equals("recliner")) {
                price = 25.0;
            }

            System.out.println("Base Price: $" + price);

            if (customerType.equals("adult")) {
                discount = 0;
            } else if (customerType.equals("child")) {
                discount = 30;
            } else if (customerType.equals("senior")) {
                discount = 25;
            }

            System.out.println("Discount: " + discount + "%");

            double finalPrice = price * (1 - discount / 100.0);
            System.out.println("Final Price: $" + finalPrice);

            count++;
            originalTotal += price;
            finalTotal += finalPrice;
        }

        boolean groupDiscount = false;
        if (n >= 5) {
            groupDiscount = true;
            finalTotal = finalTotal * 0.9;
        }

        double totalDiscount = originalTotal - finalTotal;

        System.out.println("\nTotal Tickets: " + count);
        System.out.println("Original Total: $" + originalTotal);
        System.out.println("Total Discount: $" + totalDiscount);
        System.out.println("Final Total: $" + finalTotal);
        System.out.println("Group Discount Applied: " + (groupDiscount ? "Yes" : "No"));

        sc.close();
    }
}