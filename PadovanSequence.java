import java.util.Scanner;
public class PadovanSequence
{
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n + 1];
        p[0] = p[1] = p[2] = 1;
        for (int i = 3; i <= n; i++) 
		{
            p[i] = p[i - 2] + p[i - 3];
		}
        for (int i = 0; i <= n; i++) 
		{
            System.out.print(p[i] + " ");
        }
    }
}