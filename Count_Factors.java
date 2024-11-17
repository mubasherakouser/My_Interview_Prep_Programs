//number of factors
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int res = factors(n);
        System.out.println("Number of factors: " + res);
    }
static int factors(int n) {
        int count = 1;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }
}
