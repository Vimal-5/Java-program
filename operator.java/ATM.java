import java.util.Scanner;
public class ATm {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int accountbalance=object.nextInt();
        int withdrawalamount=object.nextInt();
        int dailylimit=object.nextInt();
        if(withdrawalamount<=accountbalance && withdrawalamount<=dailylimit){
            System.out.println("Approved");
        }
        else{
            System.out.println("Declined");
        }
    }
}
