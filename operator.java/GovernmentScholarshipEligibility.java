import java.util.Scanner;
public class GovernmentScholarshipEligibility {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int familyincome=object.nextInt();
        int percentage=object.nextInt();
        if(familyincome<200000 && percentage>=75){
            System.out.println("Granted");
        }
        else{
            System.out.println("Not Granted");
        }
    }
}
