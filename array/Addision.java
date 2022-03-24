package array;
import java.util.Scanner;
public class Addision 
{
	public static void main(String[] args)
	{
		int i,j,row,column,a[][],b[][],sum[][];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the row:");
		row=sc.nextInt();
		System.out.print("Enter the column:");
		column=sc.nextInt();
		a=new int[row][column];
		b=new int[row][column];
		sum=new int[row][column];
		System.out.println("Enter first array element:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter second array element:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		sc.close();
		System.out.println("Addition of first and second array:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				System.out.print("\t"+sum[i][j]);
			}
			System.out.println("\n");
		}
	}
}
