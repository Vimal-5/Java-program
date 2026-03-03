import java.util.Scanner;
public class FuleCostTripCalculation {
    public static void main(String[] args){
        Scanner object=new Scanner(System.in);
        double distance=object.nextDouble();
        int mileage=object.nextInt();
        int fule_price=object.nextInt();
        int tollcharge=object.nextInt();
        double fule_need=distance/mileage;
        double total_fule_cost=fule_need*fule_price;
        int total_cost=(int)total_fule_cost+tollcharge;
        System.out.println(total_cost);
    }
}
