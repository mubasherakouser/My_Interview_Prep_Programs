//Java Program to check user entered date is valid or not
import java.util.Scanner;
class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter date: ");
        int dd = sc.nextInt();

        System.out.println("Enter month: ");
        int mm = sc.nextInt();

        if (dd < 1 || dd > 31 || mm < 1 || mm > 12) {
            System.out.println("Invalid date");
        } else if ((mm == 4 || mm == 6 || mm == 9 || mm == 11) && dd > 30) {
            System.out.println("Invalid date");
        } else if ((!(yy % 4 == 0 && yy % 100 != 0) || yy % 400 == 0) && mm == 2 && dd > 28) {
            System.out.println("Invalid date");
        } else if ((yy % 4 == 0 && yy % 100 != 0 || yy % 400 == 0) && mm == 2 && dd == 29) {
            System.out.println("Valid date");
        } else {
            System.out.println("Valid date");
        }
    }
}
