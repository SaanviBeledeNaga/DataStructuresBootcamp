import java.util.Scanner;
public class NumberRaisedToReverse 
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int R = sc.nextInt();
        long result = 1;
        for (int i = 1; i <= R; i++) 
		{
            result = result * N;
        }
        System.out.println(result % 1000000007);
        sc.close();
    }
}
