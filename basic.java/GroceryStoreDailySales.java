
import java.util.Scanner;

public class GroceryStoreDailySales {
    public static void main(String[] args) {
        Scanner obj=new  Scanner(System.in);
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c=obj.nextInt();
        int discount=a-(a*b/100);
        int total=discount+(discount*c/100);
        System.out.println(total);
    }
}
