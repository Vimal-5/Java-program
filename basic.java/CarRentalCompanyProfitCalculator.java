import java.util.Scanner;
public class CarRentalCompanyProfitCalculator {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int days=object.nextInt();
        int rent=object.nextInt();
        int late=object.nextInt();
        int fule=object.nextInt();
        int maintenance=object.nextInt();
        System.out.println((days*rent)+late-fule-maintenance);
    }
}
