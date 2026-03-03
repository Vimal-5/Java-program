import java.util.Scanner;
public class GymTrainerMonthlySalary {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int basesalary=object.nextInt();
        int session=object.nextInt();
        int paypersession=object.nextInt();
        int bonues=object.nextInt();
        int maintenance=object.nextInt();
        System.out.println(basesalary+(session*paypersession)+bonues-maintenance);
    }
}
