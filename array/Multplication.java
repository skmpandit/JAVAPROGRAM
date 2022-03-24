package array;
import java.util.Scanner;
public class Multplication 
{
	public static void main(String[] args)
	{
		int i,j,row,column,a[][],b[][],mul[][];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row:");
		row=sc.nextInt();
		System.out.println("Enter the column:");
		column=sc.nextInt();
		b=new int[row][column];
		a=new int[row][column];
		mul=new int[row][column];
		System.out.println("Enter element of first array:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter elemnt of second array:");
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
				mul[i][j]=a[i][j]*b[i][j];
			}
		}
		System.out.println("Multplication of array:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				System.out.print("\t"+mul[i][j]);
			}
			System.out.println();
		}
	}
}
