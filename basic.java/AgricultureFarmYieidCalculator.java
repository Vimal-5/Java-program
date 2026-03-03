import java.util.Scanner;
public class AgricultureFarmYieidCalculator {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int yieldperacre=object.nextInt();
        int acres=object.nextInt();
        int extrayeild=object.nextInt();
        int damagedcrops=object.nextInt();
        System.out.println((yieldperacre*acres)+extrayeild-damagedcrops);
    }
}