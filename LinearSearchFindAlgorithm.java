import java.util.Scanner;
public class LinearSearchFindAlgorithm
{
	public static int linearSearchFindAlgorithm(int[] arr, int index, int searchItem)
	{
		if(index>arr.length)
			return -1;
		if(arr[index]==searchItem)
			return index;
		return linearSearchFindAlgorithm(arr, index+1, searchItem);
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the search item: ");
		int searchItem = sc.nextInt();
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int result = linearSearchFindAlgorithm(arr, 0, 90);
		if(result<0)
		{
			System.out.print(searchItem + " is not found. ");
		}
		else
		{
			System.out.println(searchItem + " is found at "+ result);
		}
	}
}

		