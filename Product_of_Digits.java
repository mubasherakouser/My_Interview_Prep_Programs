//Product of digits java Program
import java.util.Scanner;
class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int product = 1;

        while (n != 0) {
            int k = n % 10;
            product *= k;
            n /= 10;
        }

        System.out.println(product);
    }
}
