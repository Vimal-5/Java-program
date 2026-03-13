import java.util.Scanner;
public class BloodDonationCampEligibilityChecker {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);

        int n=object.nextInt(),count=0;

        for(int i=1;i<=n;i++){

            String name=object.next();
            int age=object.nextInt();
            Double weight=object.nextDouble();
            Double hemoglobin=object.nextDouble();

            System.out.println("Doners:"+name);
            System.out.println("Age:"+age+"years");
            System.out.println("Weight:"+weight+"kg");
            System.out.println("Hemoglobin:"+hemoglobin+"g/dL");

            if(age>=18 && age<=65){
                if(weight>=50){
                    if(hemoglobin>=12.5){
                        System.out.println("Status:Yes");
                        count++;
                    }
                    else{
                        System.out.println("Statis:No");
                        System.out.println("Reason:Hemoglobin below 12.5g/dL");
                    }
                }
                else{
                    System.out.println("Statis:No");
                    System.out.println("Reason:Weight below 50");
                }
            }
            else{
                System.out.println("Statis:No");
                System.out.println("Reason:Age below 18 or above 65");
            }

        }

        System.out.println("Total Doners:"+n);
        System.out.println("Eligible Doners:"+count);
        System.out.println("Rejected Doners:"+(n-count));
        System.out.println("Eligiblility Rate:"+(double)count/n*100+"%");
    }
}
