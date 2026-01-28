import java.util.Scanner;
public class Evenoddmethod
{
	public int checkEvenOdd(int a, int b, int c, int d, int e, String s, String s1, String s2, int sumeven, int sumodd)
	{
		if(a%2==0) sumeven+=1;
		else sumodd+=1;
		if(b%2==0) sumeven+=1;
		else sumodd+=1;
		if(c%2==0) sumeven+=1;
		else sumodd+=1;
		if(d%2==0) sumeven+=1;
		else sumodd+=1;
		if(e%2==0) sumeven+=1;
		else sumodd+=1;
		if(s.equals(s1)) return sumeven;	
		else return sumodd;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		String s = sc.next();
		int sumeven = 0;
		int sumodd = 0;
		String s1 = "even";
		String s2 = "odd";
		Evenoddmethod obj = new Evenoddmethod();
		int print = obj.checkEvenOdd(a, b, c, d, e, s, s1, s2, sumeven, sumodd);
		System.out.print("The number of even or odd numbers is: "+ print);
	}
}
	