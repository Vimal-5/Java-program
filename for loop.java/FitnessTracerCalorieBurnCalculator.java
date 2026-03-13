import java.util.Scanner;
public class FitnessTracerCalorieBurnCalculator {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);

        int n=object.nextInt();
        int totalduration=0,totalburned=0,burned=0;


        for(int i=1;i<=n;i++){

            String type=object.next();
            int duration=object.nextInt();

            System.out.println("Session"+i+":"+type);
            System.out.println("Duration:"+duration);

            if(type.equals("running")){
                burned=10*duration;
                System.out.println("Calories Burned:"+burned);
                System.out.println("Intensity:High");
            }
            else if(type.equals("swimming")){
                burned=12*duration;
                System.out.println("Calories Burned:"+burned);
                System.out.println("Intensity:High");
            }
            else if(type.equals("cycling")){
                burned=8*duration;
                System.out.println("Calories Burned:"+burned);
                System.out.println("Intensity:Moddderate");
            }
            else if(type.equals("gym")){
                burned=7*duration;
                System.out.println("Calories Burned:"+burned);
                System.out.println("Intensity:Moderate");
            }
            else if(type.equals("walking")){
                burned=4*duration;
                System.out.println("Calories Burned:"+burned);
                System.out.println("Intensity:Low");
            }
            else{
                burned=0*duration;
                System.out.println("Calories Burned:"+burned);
                System.out.println("Intensity:None");
            }

            totalduration+=duration;
            totalburned+=burned;
        }

        System.out.println("Total Worket:"+n);
        System.out.println("Total Duration:"+totalduration);
        System.out.println("Total Calories Burned:"+totalburned);
        System.out.println("Average Calories Per Session:"+totalburned/n);

        if(totalburned<300){
            System.out.println("Fitness Level:Beginner");
        }
        else if(totalburned>=300 && totalburned<100){
            System.out.println("Fitness Level:Intermediate");
        }
        else if(totalburned>=1000){
            System.out.println("Fitness Level:Advanced");
        }
    }
}
