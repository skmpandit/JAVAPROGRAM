package array;
import java.util.Scanner;
public class Subtraction 
{
	public static void main(String[] args)
	{
		int i,j,a[][],b[][],sub[][],row,column;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the row:");
		row=sc.nextInt();
		System.out.print("Enter the column:");
		column=sc.nextInt();
		a=new int[row][column];
		b=new int[row][column];
		sub=new int[row][column];
		System.out.println("Enter the first array element:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the second array element:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				sub[i][j]=a[i][j]-b[i][j];
			}
		}
		System.out.println("Subtraction of array:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				System.out.print("\t"+sub[i][j]);
			}
			System.out.println();
		}
	}
}
