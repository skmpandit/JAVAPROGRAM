package elseIf;
import java.util.Scanner;
public class Text4 
{
	public static void main(String[] args)
	{
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter you age:");
		age=sc.nextInt();
		sc.close();
		if(age==18)
		{
			System.out.println("You are batcholar");
		}
		else if(age<=18)
		{
			System.out.println("You are child");
		}
		else if(age>=18)
		{
			System.out.println("You are a responsible man");
		}
	}
}
