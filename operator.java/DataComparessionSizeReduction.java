import java.util.Scanner;
public class DataComparessionSizeReduction {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int filesize=object.nextInt();
        int compressioncycles=object.nextInt();
        int size=filesize>>compressioncycles;
            System.out.println(size);
    }
}
