import java.util.Scanner;
public class MovieTheatreAgeAccessControl {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int age=object.nextInt();
        int idproof=object.nextInt();
        if(age>=18 && idproof==1){
            System.out.println("Entry Allowed");
        }
        else{
            System.out.println("Entry Denid");
        }
    }
}
