import java.util.Scanner;
public class SchoolBusTransportFeeCalculatin {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int distance=object.nextInt();
        int rate=object.nextInt();
        int maintenance=object.nextInt();
        int allowance=object.nextInt();
        int subsidy=object.nextInt();
        System.out.println((distance*rate)+maintenance+allowance-subsidy);
    }
}
