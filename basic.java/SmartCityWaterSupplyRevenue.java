import java.util.Scanner;
public class SmartCityWaterSupplyRevenue {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int resusage=object.nextInt();
        int resrate=object.nextInt();
        int comusage=object.nextInt();
        int comrate=object.nextInt();
        int connection=object.nextInt();
        int penalty=object.nextInt();
        int maintenance=object.nextInt();
        int treatment=object.nextInt();
        System.out.println((resusage*resrate)+(comusage*comrate)+connection+penalty-maintenance-treatment);    }
}
