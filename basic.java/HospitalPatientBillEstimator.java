import java.util.Scanner;
public class HospitalPatientBillEstimator {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int roomcharge=object.nextInt();
        int days=object.nextInt();
        int medicinecost=object.nextInt();
        int labfees=object.nextInt();
        int insurancecoverage=object.nextInt();
        System.out.println((roomcharge*days)+medicinecost+labfees-insurancecoverage);

    }
}
