package breakstatement;

public class Test2 
{
	public static void main(String[] args)
	{
		boolean t=true;
		first:
		{
			second:
			{
				third:
				{
					System.out.println("Brfore the break statement");
					if(t)
					{
						break second;
					}
					System.out.println("This won't execute");
				}
				System.out.println("This won't execute");
			}
			System.out.println("This is after second");
		}
	}
}
