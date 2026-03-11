import java.util.Scanner;
public class MonthlySalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int n=object.nextInt();

        Double commission=0.0,sales=0.0,total=0.0,bonus=0.0;
        String high="";
        Double totalamount=0.0,totalsales=0.0,max=0.0;
        for(int i=1;i<=n;i++){

            String name=object.next();
            Double amount=object.nextDouble();

            if(amount>max){
                max=amount;
                high=name;
            }

            if(amount>0 && amount<=40000){
                commission=5.0;
            }
            else if(amount>40000 && amount<=80000){
                commission=8.0;
            }
            else if(amount>80000 && amount<=100000){
                commission=10.0;
            }
            else if(amount>100000 && amount<=150000){
                commission=12.0;
            }
            else if(amount>150000){
                commission=15.0;
            }
            else{
                commission=0.0;
            }

            sales=amount*(commission/100.0);

            if(sales>=100000){
                bonus=2000.0;
            }
            else if(sales>=150000){
                bonus=3000.0;
            }
            else{
                bonus=0.0;
            }

            total=sales+bonus;

            System.out.println("Sales Rep:"+name);
            System.out.println("Sales Amount:$"+amount);
            System.out.println("Commission Rate:"+commission+"%");
            System.out.println("Commission Earned:$"+sales);
            System.out.println("Bonus:"+bonus);
            System.out.println("Total Payout:"+total);

            totalsales=totalsales+sales;
            totalamount=totalamount+amount;
        }

        System.out.println("Total Rep:"+n);
        System.out.println("Total Amount:"+totalamount);
        System.out.println("Total Sales:"+totalsales);
        System.out.println("Total Performer:"+high);
    }
}
