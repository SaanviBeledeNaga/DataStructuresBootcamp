import java.util.Scanner;
public class CombineStrings
{
	public static String combineStrings(String s1, String s2)
	{
		String s3 = s1.concat(s2);
		String s4 = s3.concat(s1);
		return s4;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first string:");
		String s1 = sc.next();
		System.out.print("Enter second string:");
		String s2 = sc.next();
		CombineStrings obj = new CombineStrings();
		System.out.println(obj.combineStrings(s1, s2));
	}
}