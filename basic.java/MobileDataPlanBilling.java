import java.util.Scanner; 
public class MobileDataPlanBilling {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int base_cost=obj.nextInt();
        int extragb=obj.nextInt();
        int cost_per_gb=obj.nextInt();
        int tax_percentage=obj.nextInt();
        double total_cost=base_cost+(extragb*cost_per_gb);
        double tax_amount=total_cost/tax_percentage;
        System.out.println(total_cost+tax_amount);
    }
}
