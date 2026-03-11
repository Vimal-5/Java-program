import java.util.Scanner;
public class AirlineTicketDynamicPricingSystem {
    public static void main(String[] args) {

        Scanner object=new Scanner(System.in);

        String bookingclass=object.next();
        int daysuntildeparture=object.nextInt();
        Double seatvailability=object.nextDouble();
        String routetype=object.next();

        Double baseprice;

        if(bookingclass.equals("domestic")){
            baseprice=200.0;
        }

        System.out.println("Booking Class:"+bookingclass);
        System.out.println("Days Until Departure:"+daysuntildeparture);
        System.out.println("Seat Availability:");
        System.out.println("Route Type:");
        System.out.println("Base Price:$"+baseprice);
        System.out.println("Demand Multiplier:");
        System.out.println("Final Ticket Price:");
        System.out.println("Pricing Category:");
    }
}
