import java.util.ArrayList;
import java.util.Scanner;

public class assesment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of first list: ");
        int size1 = sc.nextInt();
        sc.nextLine();
        ArrayList<String> list1 = new ArrayList<>();
        System.out.println("Enter elements of first list:");
        for (int i = 0; i < size1; i++) {
            list1.add(sc.nextLine());
        }

        System.out.print("Enter the size of second list: ");
        int size2 = sc.nextInt();
        sc.nextLine(); 
        ArrayList<String> list2 = new ArrayList<>();
        System.out.println("Enter elements of second list:");
        for (int i = 0; i < size2; i++) {
            list2.add(sc.nextLine());
        }

        if (list1.equals(list2)) {
            System.out.println("Both ArrayLists are equal.");
        } else {
            System.out.println("ArrayLists are NOT equal.");
        }

        sc.close();
    }
}
