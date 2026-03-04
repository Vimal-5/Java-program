import java.util.Scanner;
public class CollageEvetFundManagment {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int registration=object.nextInt();
        int sponsorship=object.nextInt();
        int stall=object.nextInt();
        int stage=object.nextInt();
        int celebrity=object.nextInt();
        int marketing=object.nextInt();
        System.out.println(registration+sponsorship+stall-stage-celebrity-marketing);
    }
}
