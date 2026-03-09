import java.util.Scanner;
public class HealthcareInsurancePremiumCalculator {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int age=object.nextInt();
        String smokingstatus=object.next();
        String preexistingcondition=object.next();
        String coveragetier=object.next();
        Double basepremium=0.0;
        Double risksurcharge=0.0;
        String agegroup;
        if(age>=18 && age<=30){
            agegroup="young";
        }
        else if(age>30 && age<=50){
            agegroup="middle";
        }
        else if(age>50 && age<=65){
            agegroup="senior";
        }
        else{
            agegroup="elderly";
        }
        if(coveragetier.equals("basic")){
            if(agegroup.equals("young")){
                basepremium=200.0;
            }
            else if(agegroup.equals("middle")){
                basepremium=250.0;
            }
            else if(agegroup.equals("senior")){
                basepremium=3500.0;
            }
            else{
                basepremium=400.0;
            }
        }
        else if(coveragetier.equals("standard")){
            if(agegroup.equals("young")){
                basepremium=300.0;
            }
            else if(agegroup.equals("middle")){
                basepremium=350.0;
            }
            else if(agegroup.equals("senior")){
                basepremium=450.0;
            }
            else{
                basepremium=550.0;
            }
        }
        else if(coveragetier.equals("premium")){
            if(agegroup.equals("young")){
                basepremium=500.0;
            }
            else if(agegroup.equals("middle")){
                basepremium=600.0;
            }
            else if(agegroup.equals("senior")){
                basepremium=700.0;
            }
            else{
                basepremium=800.0;
            }
        }
        if (smokingstatus.equals("smoker") && preexistingcondition.equals("yes")) {
            risksurcharge = basepremium * 0.70;
        } else if (smokingstatus.equals("smoker")) {
            risksurcharge = basepremium * 0.40;
        } else if (preexistingcondition.equals("yes")) {
            risksurcharge = basepremium * 0.30;
        } else {
            risksurcharge = 0.0;
        }
        Double totalpremium=basepremium+risksurcharge;
        System.out.println("Age: " + age);
        System.out.println("Smoking Status: " + smokingstatus);
        System.out.println("Pre-existing Conditions: " + preexistingcondition);
        System.out.println("Coverage Tier: " + coveragetier);
        System.out.println("Base Premium: $" + basepremium);
        System.out.println("Risk Surcharge: $" + risksurcharge);
        System.out.println("Total Monthly Premium: $" + totalpremium);
    }
}
