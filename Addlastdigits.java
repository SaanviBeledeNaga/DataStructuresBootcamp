import java.util.Scanner;
public class Addlastdigits
{
	public int addLastDigits(int input1, int input2)
	{
		return input1+input2;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first integer:");
		int a = sc.nextInt();
		System.out.print("Enter second integer:");
		int b = sc.nextInt();
		int input1 = Math.abs(a%10);
		int input2 = Math.abs(b%10);
		Addlastdigits obj = new Addlastdigits();
		int sum = obj.addLastDigits(input1, input2);
		System.out.print("The sum of last digits of two numbers is"+sum);
	}
}


	
