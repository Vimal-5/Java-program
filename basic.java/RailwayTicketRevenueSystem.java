import java.util.Scanner;
public class RailwayTicketRevenueSystem {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int genpass=object.nextInt();
        int genfare=object.nextInt();
        int acpass=object.nextInt();
        int acfare=object.nextInt();
        int platform=object.nextInt();
        int maintenance=object.nextInt();
        int fule=object.nextInt();
        System.out.println((genpass*genfare)+(acpass*acfare)+platform-maintenance-fule);
    }
}
