import java.util.Scanner;
public class DigitalSignalToggleController {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int signalvalue=object.nextInt();
        int togglemark=object.nextInt();
        System.out.println(signalvalue^togglemark);
    }
}
