import java.util.Scanner;
public class ECommerceFreeShippingEligibility {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int cartvalue=object.nextInt();
        int premimummember=object.nextInt();
        if(cartvalue>999 || premimummember==1){
            System.out.println("Free shipping");
        }
            else{
                System.out.println("Charges Applied");
            }
    }
}
