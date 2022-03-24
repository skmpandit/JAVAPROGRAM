package array;
import java.util.*;
public class ArrayDimentional 
{
	public static void main(String[] args) 
	{
		int i,arr[],n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array :");
		n=sc.nextInt();
		arr=new int[n];
		System.out.println("Enter the elements : ");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
