import java.util.Scanner;
public class commandline {
    public static void main(String[] args) {
        int a,b,sum;
        a= Integer.parseInt(args[0]);
        b= Integer.parseInt(args[1]);
        sum=a+b;
        System.out.println("\n a="+ a );
        System.out.println("\n b="+ b );
        System.out.println("\n sum="+ sum );
    }
}
