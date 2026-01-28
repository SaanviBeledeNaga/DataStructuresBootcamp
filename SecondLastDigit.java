import java.util.Scanner;
public class SecondLastDigit
{
	int secondLastDigit(int a)
	{
		if(a/10>=1)
		{
			a = a/10;
			a = a%10;
			return a;
		}
		else
		{
			return -1;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		SecondLastDigit obj = new SecondLastDigit();
		int print = obj.secondLastDigit(a);
		System.out.print(print);
	}
}
	
