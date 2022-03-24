package array;
import java.util.Scanner;
public class Dimentionalarray 
{
	public static void main(String[] args)
	{
		int row,column,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the row:");
		row=sc.nextInt();
		System.out.print("Enter the columns:");
		column=sc.nextInt();
		int a[][]=new int[row][column];
		System.out.println("Enter the element of array:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		sc.close();
		System.out.println("Your given element:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				System.out.print("\t"+a[i][j]);
			}
			System.out.println("\n");
		}
	}
}
