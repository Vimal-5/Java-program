import java.util.Scanner;
public class SystemLoginAuthentication {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int usernamematch=object.nextInt();
        int passwordmatch=object.nextInt();
        int accountlocked=object.nextInt();
        if(usernamematch!=0 && passwordmatch!=0 && accountlocked==0){
            System.out.println("Success");
        }
        else{
            System.out.println("Failed");
        }
    }
}
