import java.util.Scanner;
public class ElectricityBillCalculatorforMultipleConsumers {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);

        int n=object.nextInt();
        Double bill=0.0,sum=0.0;
        int total=0;

        for(int i=1;i<=n;i++){

            String counsumerid=object.next();
            int units=object.nextInt();

            System.out.println("Counsumer ID:"+counsumerid);
            System.out.println("Units Counsumed:"+units);
            
            if(units<=100){
                bill=units*0.10;
                System.out.println("Bill Amount:$"+bill);
            }
            else if(units<=200){
                bill=units*0.13;
                System.out.println("Bill Amount:$"+bill);
            }
            else if(units<=300){
                bill=units*0.16;
                System.out.println("Bill Amount:$"+bill);
            }
            else if(units>300){
                bill=units*0.20;
                System.out.println("Bill Amount:$"+bill);
            }
            else{
                System.out.println("Bill Amount:$0");
            }

            if(units<=200){
                System.out.println("Category:Low");
            }
            else if(units<=300){
                System.out.println("Category:Medium");
            }
            else if(units>300){
                System.out.println("Category:High");
            }
            else{
                System.out.println("Category:None");
            }

            total=total+units;
            sum=sum+bill;

        }

        System.out.println("Total Consumers:"+n);
        System.out.println("Total Units Counsumed:"+total);
        System.out.println("Total Revenue:$"+sum);
        System.out.println("Average Bill:$"+(sum/n));
        
    }
}
