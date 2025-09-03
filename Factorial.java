import java.util.Scanner;
public class Factorial {
     public static void main(String[] args) {
        int i,fact,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("\n Enter n");
        n=sc.nextInt();
        fact=1;
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.print("\n fact="+fact);
    }
}
