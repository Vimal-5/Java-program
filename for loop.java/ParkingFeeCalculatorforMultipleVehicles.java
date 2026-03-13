import java.util.Scanner;
public class ParkingFeeCalculatorforMultipleVehicles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int peakCount = 0;
        double totalRevenue = 0.0;

        for (int i = 1; i <= n; i++) {
            String type = sc.next();
            double hours = sc.nextDouble();

            System.out.println("Vehicle " + i + ": " + type);
            System.out.println("Hours Parked: " + hours);

            double rate = 0.0, cap = 0.0;
            if (type.equalsIgnoreCase("Car")) {
                rate = 3.0; cap = 30.0;
            } else if (type.equalsIgnoreCase("Motorcycle")) {
                rate = 2.0; cap = 20.0;
            } else if (type.equalsIgnoreCase("Truck")) {
                rate = 5.0; cap = 60.0;
            } else if (type.equalsIgnoreCase("Bus")) {
                rate = 7.0; cap = 100.0;
            }

            System.out.println("Hourly Rate: $" + rate);

            double calculatedFee = hours * rate;
            double finalFee = Math.min(calculatedFee, cap);

            System.out.println("Parking Fee: $" + finalFee);
            if (finalFee < calculatedFee) {
                System.out.println("Cap Applied: Yes");
            } else {
                System.out.println("Cap Applied: No");
            }

            totalRevenue += finalFee;
            if (hours > 8) peakCount++;
        }

        System.out.println("\nTotal Vehicles: " + n);
        System.out.println("Total Revenue: $" + totalRevenue);
        System.out.printf("Average Fee: $%.2f\n", totalRevenue / n);
        System.out.println("Peak Hour Vehicles (>8 hours): " + peakCount);
    }
}