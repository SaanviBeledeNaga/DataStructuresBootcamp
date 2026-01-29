import java.util.*;
public class UniformBinarySearch
{
	static int uniformBinarySearch(int[] arr, int key)
	{
		//generate lookup table
		int n = arr.length;
		int k = (int)(Math.log(n)/Math.log(2));
		int[] offset = new int [k+1];
		offset[0] = (1<<k);
		for(int i=1;i<=k;i++)
		{
			offset[i] = offset[i-1]/2;
		}
		int index = -1;
		//binary search
		for (int i = 0; i <= k; i++)
		{
		int next = index + offset[i];
		if (next < n && arr[next] <= key)
		{
			index = next;
		}
	}
	if (index>=0 && arr[index] == key)
		return index;
	return -1;
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = {1, 3, 5, 7, 9, 11, 13};
		System.out.print("Enter element to search: ");
		int key = sc.nextInt();
		int result = uniformBinarySearch(arr, key);
		if(result!=-1)
		{
			System.out.println("Element found at index: " + result);
		}
		else 
		{
			System.out.println("Element not found");
		}
	}
}

		
	
		
	
