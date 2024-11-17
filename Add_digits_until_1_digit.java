//Sum of digits until getting a single digit
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int sum = sumOfDigits(n);
        System.out.println(sum);
    }

static int sumOfDigits(int n) {
    while(n>9){
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit;
            n /= 10;
        }
        n=sum;
    }
return n;
}
}
