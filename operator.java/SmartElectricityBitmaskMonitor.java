import java.util.Scanner;
public class SmartElectricityBitmaskMonitor {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int connectionvalue=object.nextInt();
        int appliancemask=object.nextInt();
        int a=connectionvalue&appliancemask;
        if(a==appliancemask){
            System.out.println("Active");
        }
        else{
            System.out.println("Inactive");
        }
    }
}
