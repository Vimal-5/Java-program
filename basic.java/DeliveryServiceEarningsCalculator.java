import java.util.Scanner;
public class DeliveryServiceEarningsCalculator {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int delivery=object.nextInt();
        int payout=object.nextInt();
        int incentive=object.nextInt();
        int fuelcost=object.nextInt();
        System.out.println(delivery*payout+incentive-fuelcost);
    }
}
