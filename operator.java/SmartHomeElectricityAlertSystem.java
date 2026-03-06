import java.util.Scanner;
public class SmartHomeElectricityAlertSystem {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int unitsconsumed=object.nextInt();
        int voltagefluctuation=object.nextInt();
        if(unitsconsumed>500 || voltagefluctuation==1){
            System.out.println("Alert");
        }
        else{
            System.out.println("Normal");
        }
        
    }
}
