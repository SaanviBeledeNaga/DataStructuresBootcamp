import java.util.Scanner;
public class BinarySearchFindAlgorithm
{
	public static int binarySearchFindAlgorithm(int[] arr, int target)
	{
		int l = 0;
		int h = arr.length - 1;
		while(l<=h)
		{
			int m = (l+h)/2;
			if(arr[m]==target)
			{
				return m;
			}
			else if(target<arr[m])
			{
				h = m-1;
			}
			else
			{
				l = m+ 1;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println("Enter number to search: ");
		int target = sc.nextInt();
		int result = binarySearchFindAlgorithm(arr, target);
		if(result!=-1)
		{
			System.out.println("Element found at index "+result);
		}
		else
		{
			System.out.println("Element not found");
		}
	}
}
