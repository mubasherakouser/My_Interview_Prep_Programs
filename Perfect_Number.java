/*Perfect Number
A perfect number is a positive integer that is equal to the sum of its proper positive divisors, that is, the sum of its positive divisors excluding the number itself.
Example:
Consider the number 6:
 * The divisors of 6 are: 1, 2, 3, and 6.
 * The proper divisors of 6 are: 1, 2, and 3.
 * The sum of the proper divisors is: 1 + 2 + 3 = 6.
Since the sum of the proper divisors is equal to the number itself, 6 is a perfect number.*/
import java.util.Scanner;
class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        isPerfect(n);
    }

static void isPerfect(int n) {
        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        if (n == sum) {
            System.out.println("Perfect");
        } else {
            System.out.println("Not Perfect");
        }
    }
}
