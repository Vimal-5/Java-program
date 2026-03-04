import java.util.Scanner;
public class SoftwareCompanyProjectCostEstimator {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int hours=object.nextInt();
        int rate=object.nextInt();
        int design=object.nextInt();
        int testing=object.nextInt();
        int advance=object.nextInt();
        System.out.println((hours*rate)+testing+design-advance);
    }
}
