//Perfect Number java code
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
