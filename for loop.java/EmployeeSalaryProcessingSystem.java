import java.util.Scanner;
public class EmployeeSalaryProcessingSystem{
    public static void main(String[] args){

        Scanner object=new Scanner(System.in);

        int n=object.nextInt();
        Double total=0.0;

        for(int i=1;i<=n;i++){
            String employeename=object.next();
            Double basesalary=object.nextDouble();
            int performancerating=object.nextInt();

            int increment=0;
            switch(performancerating){
                case 1:
                    increment=0;break;
                case 2:
                    increment=2;break;
                case 3:
                    increment=5;break;
                case 4:
                    increment=10;break;
                case 5:
                    increment=15;break;
            }

            Double finalsalary=basesalary*(1+increment/100.0);

            System.out.println("Employee:"+employeename);
            System.out.println("Base Salary:$"+basesalary);
            System.out.println("Performance Rating:"+performancerating);
            System.out.println("Increment:"+increment+"%");
            System.out.println("Final Salary:$"+finalsalary);

            total+=finalsalary;

        }

        System.out.println("Total Employee Processed:"+n);
        System.out.println("Total Payroll:$"+total);
        System.out.println("Average Salary:$"+total/n);

    }
}