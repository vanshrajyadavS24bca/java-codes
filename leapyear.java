import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("enter no");
		int year = sc.nextInt();
		if ((year%4 == 0 && year%100 !=0) || (year%400==0))
		{
		    System.out.print("Leap year");
		} else{
		    System.out.print("Not a leap year");
		}
	}
}
