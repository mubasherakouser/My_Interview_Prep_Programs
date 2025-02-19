import java.util.Scanner;
class Day2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n : ");
		int n=sc.nextInt();
		System.out.println("Enter digit : ");
		int d=sc.nextInt();
		int c=0;
		while(n>0){
			int r=n%10;
			if(r==d)
				c++;
			n=n/10;
		}
		System.out.print(d+"->"+c+" times");
	}
}
