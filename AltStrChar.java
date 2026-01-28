import java.util.Scanner;
public class AltStrChar
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int min = Math.min(a.length(), b.length());
        for (int i=0;i<min;i++) 
		{
            System.out.print(a.charAt(i));
            System.out.print(b.charAt(i));
        }
        for (int i=min;i<a.length();i++) 
		{
            System.out.print(a.charAt(i));
        }
        for (int i=min;i<b.length();i++) 
		{
            System.out.print(b.charAt(i));
        }
    }
}
