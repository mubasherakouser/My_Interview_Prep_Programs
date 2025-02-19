import java.util.Scanner;
class Day2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Seconds : ");
		int s=sc.nextInt();
		int mins=s/60;
		int remsec=s%60;
		System.out.println(mins+" : minutes"+remsec+" : seconds");
	}
}
