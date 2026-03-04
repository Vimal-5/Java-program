import java.util.Scanner;
public class AirlineCargoRevenueSystem {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int weight=object.nextInt();
        int rate=object.nextInt();
        int priority=object.nextInt();
        int insurance=object.nextInt();
        int handling=object.nextInt();
        int fule=object.nextInt();
        System.out.println((weight*rate)+priority+insurance-handling-fule);
    }
}
