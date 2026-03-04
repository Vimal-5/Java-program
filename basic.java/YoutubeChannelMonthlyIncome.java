import java.util.Scanner;
public class YoutubeChannelMonthlyIncome {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int ads=object.nextInt();
        int sponsor=object.nextInt();
        int affiliate=object.nextInt();
        int tax=object.nextInt();
        int production=object.nextInt();
        System.out.println(ads+sponsor+affiliate-tax-production);
    }
}
