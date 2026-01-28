import java.util.Scanner;
public class CheckMultiple
{
	public int checkMultiple(int a,int b, int c, int d, int e)
	{
		if(a%b==0) return c;
		else return d;
		if(a==0 || b==0) return e;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first integer:");
		int a = sc.nextInt();
		System.out.print("Enter second integer:");
		int b = sc.nextInt();
		int c = 2;
		int d = 1;
		int e = 3;
		CheckMultiple obj = new CheckMultiple();
		int print = obj.checkMultiple(a, b, c, d, e);
		System.out.println(print);
	}
}
