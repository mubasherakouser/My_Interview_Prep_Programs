/*Happy Number
A happy number is a number that eventually reaches 1 when replaced by the sum of the squares of its digits, repeated as needed.
Example:
Let's take the number 19:
 * Square the digits of 19: 1² + 9² = 1 + 81 = 82
 * Repeat the process with 82: 8² + 2² = 64 + 4 = 68
 * Again, with 68: 6² + 8² = 36 + 64 = 100
 * And finally, with 100: 1² + 0² + 0² = 1
Since we reached 1, 19 is considered a happy number.*/
import java.util.Scanner;
class HappyNumber {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isHappy(num)) {
            System.out.println(num + " is a Happy Number");
        } else {
            System.out.println(num + " is not a Happy Number");
        }
    }
  static boolean isHappy(int n) {
        int sum = 0;
        while (n > 9) {
            sum = 0;
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }
        return n == 1 || n == 7;
    }
}
