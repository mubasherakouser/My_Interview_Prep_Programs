//Spy number Java Program
/*Spy Number Definition:
A spy number is a number where the sum of its digits and the product of its digits are equal.
Example:
Let's take the number 1124.
 * Sum of digits: 1 + 1 + 2 + 4 = 8
 * Product of digits: 1 * 1 * 2 * 4 = 8
Since the sum and product are equal, 1124 is a spy number.*/
import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if (spy(n)) {
            System.out.println("Spy number");
        } else {
            System.out.println("Not a spy number");
        }
    }

static boolean spy(int n) {
        int sum = 0, product = 1, rem;

        while (n > 0) {
            rem = n % 10;
            sum += rem;
            product *= rem;
            n /= 10;
        }
        return sum == product;
    }
}
