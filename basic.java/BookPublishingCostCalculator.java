import java.util.Scanner;
public class BookPublishingCostCalculator {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int copies=object.nextInt();
        int cost=object.nextInt();
        int edition=object.nextInt();
        int design=object.nextInt();
        int commission=object.nextInt();
        int marketing=object.nextInt();
        System.out.println((copies*cost)+edition+design-commission-marketing);
    }
}
