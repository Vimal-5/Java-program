import java.util.Scanner;

public class Assessment1 {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);

        int size1 = object.nextInt();
        object.nextLine(); // consume newline

        String[] arr = new String[size1];
        for(int i = 0; i < size1; i++){
            arr[i] = object.nextLine();
        }

        System.out.println("Enter the target index values:");
        int a = object.nextInt();
        int b = object.nextInt();

        if(a >= 0 && b < size1){
            if(a <= b){
                for(int i = a; i <= b; i++){
                    System.out.println(arr[i]);
                }
            } else {
                for(int i = a; i >= b; i--){
                    System.out.println(arr[i]);
                }
            }
        } else {
            System.out.println("Invalid index range!");
        }

        object.close();
    }
}
