package stringExample;

public class CharAtOutOfRange 
{
	public static void main(String[] args) throws Exception
	{
		try
		{
		String s="Sonu Kumar Mahto";
		char c=s.charAt(20);
		System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Exception thrown "+e);
		}
	}
}
