import java.util.Scanner;
public class basic {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        
        int size1=object.nextInt();
        int size2=object.nextInt();
        int[][] arr=new int[size1][size2];

        for(int i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
                arr[i][j]=object.nextInt();
            }
        }

        for(int i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
                System.out.print(arr[i][j]+" ");
            }
        }

        object.close();
    }
}