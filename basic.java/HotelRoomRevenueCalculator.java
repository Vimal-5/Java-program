import java.util.Scanner;
public class HotelRoomRevenueCalculator {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int rooms=object.nextInt();
        int price=object.nextInt();
        int servicecharge=object.nextInt();
        int commission=object.nextInt();
        System.out.println((rooms*price)+servicecharge-commission);
    }
}
