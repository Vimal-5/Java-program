import java.util.Scanner;
public class EmployeeOvertimeBonusEligibility {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int workinghour=object.nextInt();
        int attedancepersantage=object.nextInt();
        if(workinghour>40 && attedancepersantage>=90){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }
    }
}
