import java.util.Scanner;
public class InventoryStockManagementSystem {
    public static void main(String[] args){
        Scanner object=new Scanner(System.in);
        int n=object.nextInt();

        int count=0;
        int a=0;
        int b=0;
        int c=0;
        for(int i=1;i<=n;i++){
            String name=object.next();
            int currentstock=object.nextInt();
            int minimumstock=object.nextInt();

            System.out.println("Prodct:"+name);
            System.out.println("Current Stock:"+currentstock);
            System.out.println("Minimum Stock:"+minimumstock);

            if(currentstock>=minimumstock){
                System.out.println("Status:Adequate");
                System.out.println("Reorder Quantity:0");
            }
            else if(currentstock<minimumstock/2){
                System.out.println("Status:Critical");
                count++;
                a=(minimumstock-currentstock)+minimumstock/2;
                System.out.println("Reorder Quantity:"+a);
            }
            else{
                System.out.println("Status:Low Stack");
                c++;
                a=(minimumstock-currentstock)+minimumstock/2;
                System.out.println("Reorder Quantity:"+a);
            }

            b+=a;

        }

        System.out.println("Total Product:"+n);
        System.out.println("Low Stock Items:"+count);
        System.out.println("Critical Items:"+c);
        System.out.println("Total Reorder Quantity:"+b);

    }
}
