import java .util.Scanner;
public class day{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Day Number ");
        int day = sc.nextInt();
        switch(day)
        {
            case 1:
                System.out.print("\n Monday");
                break;
            case 2:
                System.out.print("\n Tuesday");
                break;
            case 3:
                System.out.print("\n Wednesday");
                break;
            case 4:
                System.out.print("\n Thursday");
                break;
            case 5:
                System.out.print("\n Friday");
                break;
            case 6:
                System.out.print("\n Saturday");
                break;
            case 7:
                System.out.print("\n Sunday");
                break;
            default:
            System.out.print("Invalid");
        }
    }
}