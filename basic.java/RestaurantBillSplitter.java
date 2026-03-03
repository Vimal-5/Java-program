import java.util.Scanner;

public class RestaurantBillSplitter {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        double totalbill=obj.nextInt();
        double service=obj.nextInt();
        double gst=obj.nextInt();
        int n_pertion=obj.nextInt();
        double  ser_charge=totalbill*service/100;
        double gst_charge=totalbill*gst/100;
        double final_bill=totalbill+ser_charge+gst_charge;
        System.out.println(final_bill/n_pertion);
    }
}
