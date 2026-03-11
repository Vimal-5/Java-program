import java.util.Scanner;
public class ATMCashWithdrawelValidator {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);

        Double balance=object.nextDouble();
        int attempts=object.nextInt();
        int count=0;
        Double total=0.0;

        for(int i=1;i<=attempts;i++){

            Double amount=object.nextDouble();
            if(amount<=balance){
                System.out.println("Transaction"+i+":$"+amount);
                System.out.println("Status:Approved");
                balance-=amount;
                System.out.println("Remaining Balance:$"+balance);
                count++;
                total=total+amount;
            }
            else{
                System.out.println("Transaction"+i+":$"+amount);
                System.out.println("Status:Denied");
                System.out.println("Reason:Insufficient funds");
                System.out.println("Remaining Balance:$"+balance);
            }

        }

        System.out.println("Total Transactions:"+attempts);
        System.out.println("Successful Withdrawals:"+count);
        System.out.println("Failed Withdrawals:"+(attempts-count));
        System.out.println("Final Balance:$"+balance);
        System.out.println("Total Withdrawals:$"+total);
    }
}
