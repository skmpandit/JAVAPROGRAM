package breakstatement;

public class Test3 
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
					System.out.println("Before break");
					if(t)
					{
						break third;
					}
					System.out.println("third block");
				}
				System.out.println("Scond block");
			}
			System.out.println("First block");
		}
	}
}
