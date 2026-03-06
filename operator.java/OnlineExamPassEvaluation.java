import java.util.Scanner;
public class OnlineExamPassEvaluation{
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int theorymarks=object.nextInt();
        int practicalmarks=object.nextInt();
        int average=(theorymarks+practicalmarks)/2;
        if(theorymarks>=50 && practicalmarks>=50 && average>=60){
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}