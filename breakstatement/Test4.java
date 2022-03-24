package breakstatement;

public class Test4 
{
	public static void main(String[] args)
	{
		boolean f=false;
		first:
		{
			second:
			{
				third:
				{
					System.out.println("Before break");
					if(f)
					{
						break second;
					}
					System.out.println("Third block");
				}
				System.out.println("Second block");
			}
			System.out.println("First block");
		}
	}
}
