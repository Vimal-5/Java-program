import java.util.Scanner;
public class WarehouseBoxCapacityDoublingSystem {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int basecases=object.nextInt();
        int levels=object.nextInt();
        System.out.println(basecases<<levels);
    }
}
