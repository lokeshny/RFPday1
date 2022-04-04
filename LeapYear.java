import java.util.Scanner;
public class LeapYear {
    static int x;

    public static void main(String[] args) {

        System.out.println("program to check leap year");
        Scanner year = new Scanner(System.in);
        System.out.println("enter the year ");
        x = year.nextInt();
        if ((x % 4 == 0) && (x % 100 != 0) || (x % 400 == 0)) {
            System.out.println(x + " year is a leap year");
        } else
            System.out.println(x + " year is not a leap year");

    }
}