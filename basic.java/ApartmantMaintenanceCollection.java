import java.util.Scanner;
public class ApartmantMaintenanceCollection {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int maintenance=object.nextInt();
        int parking=object.nextInt();
        int hall=object.nextInt();
        int security=object.nextInt();
        int eletricity=object.nextInt();
        int cleaning=object.nextInt();
        System.out.println(maintenance+parking+hall-security-eletricity-cleaning);
    }
}
