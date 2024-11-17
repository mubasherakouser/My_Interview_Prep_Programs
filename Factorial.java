//Factorial java Program
import java.util.Scanner;
class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter one integer number: ");
        int n = sc.nextInt();

        int f = factorial(n);
        System.out.println(f);
    }

static int factorial(int n) {
        int fact = 1;

        for (int i = n; i >= 1; i--) {
            fact = fact * i;
        }

        return fact;
    }
}
