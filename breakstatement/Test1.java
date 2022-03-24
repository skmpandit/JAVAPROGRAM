package breakstatement;

public class Test1 
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
					System.out.println("Statement before break");
					if(t)
					{
						break first;
					}
					System.out.println("After third");
				}
				System.out.println("Second block");
			}
			System.out.println("first Block");
		}
		System.out.println("first is break");
	}
}
