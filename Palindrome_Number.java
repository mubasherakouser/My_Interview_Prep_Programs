//Palindrome program in java
class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if (isPalindrome(n)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
  static boolean isPalindrome(int n) {
        int rev = 0, rem, temp = n;
        while (n > 0) {
            rem = n % 10;
            rev = (rev * 10) + rem;
            n /= 10;
        }
        return rev == temp;
    }
}
