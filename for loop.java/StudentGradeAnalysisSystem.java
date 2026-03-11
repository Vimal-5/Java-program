import java.util.Scanner;
public class StudentGradeAnalysisSystem {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int n=object.nextInt();

        int total=0;
        int count=0;
        int highestscore=0;
        Double average=0.0;
        for(int i=1;i<=n;i++){
            String name=object.next();
            int score=object.nextInt();

            if(highestscore<score){
                highestscore=score;
            }

            char grade;
            if(score>=85 && score<=100){
                grade='A';
            }
            else if(score>=70 && score<85){
                grade='B';
            }
            else if(score>=60 && score<70){
                grade='C';
            }
            else if(score>=50 && score<60){
                grade='D';
            }
            else{
                grade='F';
            }

            System.out.println("Student:"+name);
            System.out.println("Score:"+score);
            System.out.println("Letter Grade:"+grade);
            if(score>=60){
                System.out.println("Status:Pass");
                count++;
            }
            else{
                System.out.println("Status:Fail");
            }

            total=total+score;
        }

        System.out.println("Total Students:"+n);
        System.out.println("Class Average:"+total/n);
        System.out.println("Highest Score:"+highestscore);
        System.out.println("Students Passed:"+count);
        System.out.println("Students Failed:"+(n-count));

    }
}
