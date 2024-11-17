//Count number of digits
import java.util.Scanner;
class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;

        while (n != 0) {
            int k = n % 10; // get digit
            count++; // count digit
            n /= 10; // delete digit
        }

        System.out.println(count);
    }
}
