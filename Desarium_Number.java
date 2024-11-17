/*Desarium Number
A Desarium number is a number where the sum of the digits raised to the power of their respective positions is equal to the original number itself.
Example:
Let’s take the number 135:
 * Digit 1: 1 raised to the power of 1 (its position) = 1^1 = 1
 * Digit 3: 3 raised to the power of 2 (its position) = 3^2 = 9
 * Digit 5: 5 raised to the power of 3 (its position) = 5^3 = 125
Now, adding these results: 1 + 9 + 125 = 135
Since the sum is equal to the original number, 135 is a Desarium number.*/
import java.util.Scanner;
import java.lang.Math;
class Demo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();	
        if(isDesarium(n)){
			System.out.println("Desarium number");
		}
        else{
			System.out.println("Not a Desarium number");
		}
	}
static boolean isDesarium(int n){
	int cd=countDigits(n);
	int s=0,temp=n;
	while(n>0){
		int rem=n%10;
		int p=(int)Math.pow(rem,cd);
		s=s+p;
		n=n/10;
		cd--;
	}
	return s==temp;
}
static int countDigits(int n){
	int c=0;
	while(n>0){
		int rem=n%10;
		c++;
		n=n/10;
	}
	return c;
}
}
