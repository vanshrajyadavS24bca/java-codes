import java.util.Scanner;
public class Cricketmatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balls[]=new int[6];
        int total_runs=0,dot_balls=0,highest_run=0;
        int i;
        System.out.println("Enter Runs Scored in 6 Balls");
        for(i=0;i<6;i++){
            System.out.println("\n Ball"+(i+1)+":");
            balls[i]=sc.nextInt();
        }
        for(i=0;i<6;i++){
            total_runs=total_runs+balls[i];
            if(balls[i]==0){
                dot_balls++;
            }
            if(balls[i]>highest_run){
                highest_run=balls[i];
            }
        }
    System.out.println("\n Total Runs Scored:"+total_runs);
    System.out.println("\n Dot Balls Scored:"+dot_balls);
    System.out.println("\n Highest Run Scored:"+highest_run);
    }
}
