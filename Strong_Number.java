/*Strong Number Definition and Example
A strong number is a number whose sum of the factorials of its digits is equal to the number itself.
Example:
Let's consider the number 145.
 * Break down the number into its digits: 1, 4, and 5.
 * Calculate the factorial of each digit:
   * Factorial of 1: 1! = 1
   * Factorial of 4: 4! = 24
   * Factorial of 5: 5! = 120
 * Sum the factorials: 1 + 24 + 120 = 145
 * Compare the sum with the original number: Since the sum (145) is equal to the original number (145), 145 is a strong number.*/
class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if (isStrong(n)) {
            System.out.println("Strong number");
        } else {
            System.out.println("Not a strong number");
        }
    }
static boolean isStrong(int n) {
        int sum = 0, temp = n;
        while (n > 0) {
            int rem = n % 10;
            int fact = factorial(rem);
            sum = sum + fact;
            n /= 10;
        }
        return sum == temp;
    }
static int factorial(int n) {
        int fact = 1;
        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }
        return fact;
    }
}
