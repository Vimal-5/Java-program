import java.util.Scanner;
public class EmpolyeePerformanceBonusCalculator{
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int performancerating=object.nextInt();
        int yearsOfService=object.nextInt();
        String departmenttype=object.next();
        Double basesalary=object.nextDouble();
        if(performancerating>=3) {
            if(departmenttype.equals("critical")){
                if(performancerating==5 && yearsOfService>5){
                    System.out.println("Performance Rating:"+performancerating);
                    System.out.println("Years of Service:"+yearsOfService);
                    System.out.println("Department Type:"+departmenttype);
                    System.out.println("Bonus Persantage:25%");
                    System.out.println("Bonus Amount:$"+(basesalary*(0.25)));
                    System.out.println("Status:Not Eligibile");
                }
                else if(performancerating==4 && yearsOfService>10){
                    System.out.println("Performance Rating:"+performancerating);
                    System.out.println("Years of Service:"+yearsOfService);
                    System.out.println("Department Type:"+departmenttype);
                    System.out.println("Bonus Persantage:22%");
                    System.out.println("Bonus Amount:$"+(basesalary*(0.22)));
                    System.out.println("Status:Not Eligibile");
                }
                else if(performancerating==4){
                    System.out.println("Performance Rating:"+performancerating);
                    System.out.println("Years of Service:"+yearsOfService);
                    System.out.println("Department Type:"+departmenttype);
                    System.out.println("Bonus Persantage:15%");
                    System.out.println("Bonus Amount:$"+(basesalary*(0.15)));
                    System.out.println("Status:Not Eligibile");
                }
                else if(performancerating==3){
                    System.out.println("Performance Rating:"+performancerating);
                    System.out.println("Years of Service:"+yearsOfService);
                    System.out.println("Department Type:"+departmenttype);
                    System.out.println("Bonus Persantage:10%");
                    System.out.println("Bonus Amount:$"+(basesalary*(0.10)));
                    System.out.println("Status:Not Eligibile");
                }
            }
            else{
                if(performancerating==5){
                    System.out.println("Performance Rating:"+performancerating);
                    System.out.println("Years of Service:"+yearsOfService);
                    System.out.println("Department Type:"+departmenttype);
                    System.out.println("Bonus Persantage:18%");
                    System.out.println("Bonus Amount:$"+(basesalary*(0.18)));
                    System.out.println("Status:Not Eligibile");
                }
                else if(performancerating==4){
                    System.out.println("Performance Rating:"+performancerating);
                    System.out.println("Years of Service:"+yearsOfService);
                    System.out.println("Department Type:"+departmenttype);
                    System.out.println("Bonus Persantage:12%");
                    System.out.println("Bonus Amount:$"+(basesalary*(0.12)));
                    System.out.println("Status:Eligibile");
                }
                else if(performancerating==3){
                    System.out.println("Performance Rating:"+performancerating);
                    System.out.println("Years of Service:"+yearsOfService);
                    System.out.println("Department Type:"+departmenttype);
                    System.out.println("Bonus Persantage:8%");
                    System.out.println("Bonus Amount:$"+(basesalary*(0.08)));
                    System.out.println("Status:Eligibile");
                }
            }
        }
        else {
            System.out.println("Performance Rating:"+performancerating);
            System.out.println("Years of Service:"+yearsOfService);
            System.out.println("Department Type:"+departmenttype);
            System.out.println("Bonus Persantage:0%");
            System.out.println("Bonus Amount:$0.0");
            System.out.println("Status:Not Eligibile");
        }
    }
}