//Sum of digits
import java.util.Scanner;
class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        while (n != 0) {
            int k = n % 10;
            sum += k;
            n /= 10;
        }

        System.out.println(sum);
    }
}
