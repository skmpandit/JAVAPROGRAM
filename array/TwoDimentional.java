package array;

import java.util.Scanner;

public class TwoDimentional 
{
	public static void main(String[] args) 
	{
		int i,j,arr[][],n,m;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the row :");
		n=sc.nextInt();
		System.out.print("Enter the column: ");
		m=sc.nextInt();
		System.out.println("Enter the elements: ");
		arr=new int[n][m];
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
