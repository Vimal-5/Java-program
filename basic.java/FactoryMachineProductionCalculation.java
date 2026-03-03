import java.util.Scanner;
public class FactoryMachineProductionCalculation {
    public static void main(String[] args){
        Scanner object=new Scanner(System.in);
        int rodsperhour=object.nextInt();
        int hoursworked=object.nextInt();
        int overtimerods=object.nextInt();
        int rejectedrods=object.nextInt();
        System.out.println(rodsperhour*hoursworked+overtimerods-rejectedrods);
    }
    
}
