import java.util.Scanner;
public class CreditCardPurchaseValidation {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int creditlimit=object.nextInt();
        int purchaseamount=object.nextInt();
        int cardblocked=object.nextInt();
        if(creditlimit>=purchaseamount && cardblocked==0){
            System.out.println("Approved");
        }
        else{
            System.out.println("Declined");
        }
    }
}
