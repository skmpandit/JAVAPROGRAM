package array;
import java.util.Scanner;
public class Division 
{
	public static void main(String[] args)
	{
		int i,j,row,column;
		float a[][],b[][],div[][];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the rows:");
		row=s.nextInt();
		System.out.println("Enter the columns:");
		column=s.nextInt();
		a=new float[row][column];
		b=new float[row][column];
		div=new float[row][column];
		System.out.println("Enter elements of first array:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				a[i][j]=s.nextInt();
			}
		}
		System.out.println("Enter elements fo second array:");
		for(i=0;i<row;i++)
		{
			
			for(j=0;j<column;j++)
			{
				b[i][j]=s.nextInt();
			}
		}
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				div[i][j]=a[i][j]/b[i][j];
			}
		}
		System.out.println("Division of array:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				System.out.print("\t"+div[i][j]);
			}
			System.out.println();
		}
	}
}
