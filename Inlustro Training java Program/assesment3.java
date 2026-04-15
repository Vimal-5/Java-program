import java.util.ArrayList;
import java.util.Scanner;

public class assesment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Enter the elements:");
        for (int i = 0; i < size; i++) {
            list.add(sc.nextLine());
        }

        System.out.print("Enter the index to retrieve: ");
        int index = sc.nextInt();

        if (index >= 0 && index < list.size()) {
            System.out.println("Element at index " + index + " is: " + list.get(index));
        } else {
            System.out.println("Invalid index!");
        }

        sc.close();
    }
}
