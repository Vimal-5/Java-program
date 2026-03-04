import java.util.Scanner;
public class SportsTournamentPrizeFund {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int registration=object.nextInt();
        int bordcast=object.nextInt();
        int sponsor=object.nextInt();
        int prize=object.nextInt();
        int rent=object.nextInt();
        int advertising=object.nextInt();
        System.out.println(registration+bordcast+sponsor-prize-rent-advertising);
    }
}
