public class InsertionSortAlgorithm
{
	public static void main(String[] args)
	{
		int[] A = {Integer.MIN_VALUE, 77, 33, 44, 11, 88, 22, 66, 55};
		int N = A.length -1;
		for(int k = 2; k<=N; k++)
		{
			int temp = A[k];
			int p = k -1;
			while(temp<A[p])
			{
				A[p+1] = A[p];
				p = p -1;
			}
			A[p+1] = temp;
			System.out.print("Pass "+(k-1)+ ": ");
			for(int i = 1; i<=N;i++)
			{
				System.out.print(A[i] + " ");
			}
			System.out.println();
		}
	}
}