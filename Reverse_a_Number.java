//Reverse a number java Program
import java.util.Scanner;
class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(reverse(n));
    }

static int reverse(int n) {
        int rev = 0, rem;  
        while (n > 0) {
            // Extract the last digit
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return rev;
    }
}
