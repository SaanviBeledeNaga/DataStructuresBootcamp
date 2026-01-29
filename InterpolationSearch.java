import java.util.Scanner;
public class InterpolationSearch
{
	public static int interpolationSearch(int[] array, int target)
	{
		int start = 0;
		int end = array.length - 1;
		while(start<= end && target >= array[start] && target<= array[end])
		{
			if(array[start] == target)
				return start;
			else 
				return -1;
		}
		int pos = start + ((end - start) * (target - array[start])/(array[end] - array[start]));
		if(array[pos] ==  target)
		{
			return pos;
		}
		if(array[pos]<target)
		{
			start = pos + 1;
		}
		else
		{
			end = pos - 1;
		}
	return 1;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = {2, 4, 6, 7, 10, 11, 14, 15};
		System.out.print("Enter element to search: ");
		int x = sc.nextInt();
		int result = interpolationSearch(arr,x);
		if(result!=-1)
		{
			System.out.println("Element is found at index "+result);
		}
		else
		{
			System.out.println("Element is not found in arr[]");
		}
	}
}

