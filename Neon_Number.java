/*Neon Number Definition:
A neon number is a number where the sum of digits of the square of the number is equal to the number itself.
Example:
Let's take the number 9.
 * Square of 9: 9 * 9 = 81
 * Sum of digits of 81: 8 + 1 = 9
Since the sum of the digits of the square is equal to the original number (9), 9 is a neon number.*/
import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if (neon(n) {
            System.out.println("Neon number");
        } else {
            System.out.println("Not a neon number");
        }
    }
static boolean neon(int n) {
        int sqr = n * n;
        int sum = 0;

        while (sqr > 0) {
            int rem = sqr % 10;
            sum += rem;
            sqr /= 10;
        }

        return sum == n;
    }
}
