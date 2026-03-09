import java.util.Scanner;
public class BankLoneApprovalSystem {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int creditscore=object.nextInt();
        Double annualincome=object.nextDouble();
        Double depttoincome=object.nextDouble();
        String lonetype=object.next();
        if(creditscore<600 || depttoincome>50){
            System.out.println("Credit Score:"+creditscore);
            System.out.println("Annual Income:$"+annualincome);
            System.out.println("Debt to Income Ratio:"+depttoincome+"%");
            System.out.println("Loan Type:"+lonetype);
            System.out.println("Loan Approval Status:Rejected");
            System.out.println("Maximum Loan Amount:$"+annualincome*0);
        }
        else if(creditscore>=750 && depttoincome<=30 && lonetype.equals("home")){
            System.out.println("Credit Score:"+creditscore);
            System.out.println("Annual Income:$"+annualincome);
            System.out.println("Debt to Income Ratio:"+depttoincome+"%");
            System.out.println("Loan Type:"+lonetype);
            System.out.println("Loan Approval Status:Approved");
            System.out.println("Maximum Loan Amount:$"+annualincome*4);
        }
        else if(creditscore>=600 && creditscore<750 && depttoincome>30 && depttoincome<=40 && lonetype.equals("home")){
            System.out.println("Credit Score:"+creditscore);
            System.out.println("Annual Income:$"+annualincome);
            System.out.println("Debt to Income Ratio:"+depttoincome+"%");
            System.out.println("Loan Type:"+lonetype);
            System.out.println("Loan Approval Status:Needs Review");
            System.out.println("Maximum Loan Amount:$"+annualincome*3);
        }
        else if(creditscore>=750 && depttoincome<=30 && lonetype.equals("personal")){
            System.out.println("Credit Score:"+creditscore);
            System.out.println("Annual Income:$"+annualincome);
            System.out.println("Debt to Income Ratio:"+depttoincome+"%");
            System.out.println("Loan Type:"+lonetype);
            System.out.println("Loan Approval Status:Approved");
            System.out.println("Maximum Loan Amount:$"+annualincome*1);
        }
        else if(creditscore>=650 && creditscore<700 && depttoincome>30 && depttoincome<=40 && lonetype.equals("personal")){
            System.out.println("Credit Score:"+creditscore);
            System.out.println("Annual Income:$"+annualincome);
            System.out.println("Debt to Income Ratio:"+depttoincome+"%");
            System.out.println("Loan Type:"+lonetype);
            System.out.println("Loan Approval Status:Needs Review");
            System.out.println("Maximum Loan Amount:$"+annualincome*0.5);
        }
        else if(lonetype.equals("business")){
            if((creditscore>=750 || (creditscore>=700 && creditscore<750)) && (depttoincome<=30 || (depttoincome>30 && depttoincome<=40))){
                System.out.println("Credit Score:"+creditscore);
                System.out.println("Annual Income:$"+annualincome);
                System.out.println("Debt to Income Ratio:"+depttoincome+"%");
                System.out.println("Loan Type:"+lonetype);
                System.out.println("Loan Approval Status:Approved");
                System.out.println("Maximum Loan Amount:$"+annualincome*3);
            }
        }
    }
}
