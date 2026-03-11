import java.util.Scanner;
public class HostelRoomOccupancyTracker {
    public static void main(String[] args) {
        Scanner object=new Scanner(System.in);
        int n=object.nextInt();

        int count=0,peak=0,max=0;
        Double rate=0.0,sum=0.0;

        for(int i=1;i<=n;i++){

            int day=object.nextInt();
            int occupied=object.nextInt();
            int totalroom=object.nextInt();

            if(max<occupied){
                max=occupied;
                peak=day;
            }

            rate=((double)occupied/totalroom)*100.0;

            System.out.println("Day:"+day);
            System.out.println("Rooms Occupied:"+occupied);
            System.out.println("Occupancy Rate:"+rate+"%");
            if(rate<60){
                System.out.println("Status:Low");
            }
            else if(rate<80){
                System.out.println("Status:Moderate");
            }
            else if(rate<100){
                System.out.println("Status:High");
            }
            else if(rate==100){
                System.out.println("Status:Full");
                count++;
            }
            else{
                System.out.println("Status:None");
            }

            sum=sum+rate;
        }

        System.out.println("Total Analyzed:"+n);
        System.out.println("Average Occupancy Rate:"+sum/n);
        System.out.println("Peak Occupancy Day:"+peak);
        System.out.println("Days at Full Capacity:"+count);
    }
}
