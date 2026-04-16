import java.util.Scanner;
public class findtarget {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);

        int size1=object.nextInt();
        int size2=object.nextInt();

        int[][] arr=new int[size1][size2];

        for(int i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
                arr[i][j]=object.nextInt();
            }
        }

        int target=object.nextInt();
        int count=0;

        for(int i=0;i<size1;i++){
            for(int j=0;j<size2;j++){
                if(arr[i][j]==target){
                    System.out.println("true");
                    count++;
                }
            }
        }

        if(count==0){
            System.out.println("false");
        }
    }
}
