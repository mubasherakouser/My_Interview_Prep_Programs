//Program to find n power p
class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        System.out.println("Enter p: ");
        int n = sc.nextInt();
        int p = sc.nextInt();
        int res = power(n, p);
        System.out.println(res);
    }

    static int power(int n, int p) {
        int pow = 1;
        for (int i = 1; i <= p; i++) {
            pow = pow * n;
        }
        return pow;
    }
}
