/*Armstrong Number
An Armstrong number is a number that is equal to the sum of the power of each digit.Give power based on number of digits.
Example:
Let's take the number 153:
 * Cube each digit: 1³ + 5³ + 3³ = 1 + 125 + 27
 * Sum the cubes: 1 + 125 + 27 = 153
Since the sum of the cubes of the digits is equal to the original number, 153 is an Armstrong number.*/
import java.util.Scanner;
import java.lang.Math;
class ArmstrongNumber {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
static boolean isArmstrong(int n) {
        int cd = countDigit(n);
        int sum = 0, temp = n;
        while (n > 0) {
            int rem = n % 10;
            int pow = (int) Math.pow(rem, cd);
            sum += pow;
            n /= 10;
        }
        return sum == temp;
    }
static int countDigit(int n) {
        int count = 0;
        while (n > 0) {
            int rem = n % 10; // Optional
            count++;
            n /= 10;
        }
       return count;
    }
}
