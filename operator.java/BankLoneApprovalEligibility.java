import java.util.Scanner;
public class BankLoneApprovalEligibility {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int salary=object.nextInt();
        int creditscore=object.nextInt();
        if(salary>25000 && creditscore>700){
            System.out.println("Approved");
        }
        else{
            System.out.println("Declined");
        }
    }
}
