import java.util.Scanner;
public class CinemaTheatreCollectionReport {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int ticketrevenue=object.nextInt();
        int snackrevenue=object.nextInt();
        int maintenance=object.nextInt();
        int electricity=object.nextInt();
        System.out.println(ticketrevenue+snackrevenue-maintenance-electricity);
    }
}
