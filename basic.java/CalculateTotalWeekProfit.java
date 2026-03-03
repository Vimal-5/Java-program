import java.util.Scanner;
public class CalculateTotalWeekProfit {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int daysworked=object.nextInt();
        int wageperday=object.nextInt();
        int overtimebonus=object.nextInt();
        int maintenancecharge=object.nextInt();
        int profit=(daysworked*wageperday)+overtimebonus-maintenancecharge;
        System.out.println("Final weekly wage "+profit);
    }
}
