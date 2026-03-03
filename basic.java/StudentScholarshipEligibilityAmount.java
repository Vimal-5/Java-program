
import java.util.Scanner;

public class StudentScholarshipEligibilityAmount {
    public static void main(String[] args) {
        Scanner obj=new  Scanner(System.in);
        int tuitionfee=obj.nextInt();
        int scholarship=obj.nextInt();
        int examfee=obj.nextInt();
        int libraryfee=obj.nextInt();
        int payablefee=tuitionfee-(tuitionfee*scholarship/100)+examfee+libraryfee;
        System.out.println(payablefee);
    }
}
