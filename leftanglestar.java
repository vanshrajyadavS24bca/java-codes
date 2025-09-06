import java.util.Scanner;

public class leftanglestar {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        int i,j,n;
        System.out.println("\n Enter No ");
        n = sc.nextInt();
        int Stars=1; int Space=n-1;
        for (i=1; i<=n; i++)
        {
            for (j=1; j<=Space; j++)
            {
                System.out.println(" ");
            }
            for (j=1; j<=Stars; j++)
            {
                System.out.print("*");
            }
            Stars++;Space--;
            System.out.print("\n");
        }
    }
}
