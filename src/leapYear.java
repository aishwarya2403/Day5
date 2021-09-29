import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {
        Scanner Scan= new Scanner(System.in);
        System.out.println("Enter the year to be checked:");
        int year = Scan.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    System.out.println(year + "is leap year");
                else
                    System.out.println(year + " is not Leap Year");
            } else
                System.out.println(year + " is Leap Year");
        } else
            System.out.println(year + " is not Leap Year");
    }
}
