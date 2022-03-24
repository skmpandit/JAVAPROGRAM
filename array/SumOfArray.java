package array;
import java.util.*;
public class SumOfArray 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i,n,arr[],sum=0;
		System.out.println("Enter the size of array: ");
		n=sc.nextInt();
		System.out.println("Enter the elements of array: ");
		arr=new int[n];
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}
		System.out.print("The sum of array : "+sum);
		
	}
}
