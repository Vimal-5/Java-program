import java.util.Scanner;
public class ProductPriceDiscountCalculator {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);

        int n=object.nextInt();
        int discount=0,totalitem=0;
        Double subtotal=0.0,total=0.0,finaltotal=0.0;

        for(int i=1;i<=n;i++){

            String name=object.next();
            Double price=object.nextDouble();
            int quantity=object.nextInt();

            if(quantity==1){
                discount=0;
            }
            else if(quantity>=2 && quantity<=4){
                discount=10;
            }
            else if(quantity>=5 && quantity<=9){
                discount=15;
            }
            else if(quantity>=10){
                discount=20;
            }

            subtotal=price*quantity*(1-discount/100.0);

            System.out.println("Product:"+name);
            System.out.println("Unit Price:$"+price);
            System.out.println("Quantity:"+quantity);
            System.out.println("Discount:"+discount+"%");
            System.out.println("Subtotal:$"+subtotal);

            total+=price*quantity;
            finaltotal+=subtotal;
            totalitem+=quantity;

        }

        System.out.println("Total Items:"+totalitem);
        System.out.println("Original Total:"+total);
        System.out.println("Total Discount:"+(total-finaltotal));
        System.out.println("Final Total:"+finaltotal);
        System.out.println("Savings:"+((total-finaltotal)/total)*100);
    }
}
