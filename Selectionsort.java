public class Selectionsort
{
	public static void main(String[] args)
	{
		int[] a = {77, 33, 44, 11, 88, 22, 66, 55};
		int min, temp;
		for(int i = 0; i<a.length -1; i++)
		{
			min = i;
			for(int j = i+1; j<a.length;j++)
			{
				if(a[j]<a[min])
				{
					min = j;
				}
			}
			temp = a[i];
			a[i] = a[min];
			a[min] = temp;
			System.out.print("Pass " + (i+1) + ": ");
			for(int k = 0; k<a.length;k++)
			{
				System.out.print(a[k]+" ");
			}
			System.out.println();
		}
	}
}