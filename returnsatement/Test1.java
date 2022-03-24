package returnsatement;

public class Test1 
{
	public static void main(String[] args)
	{
		boolean f=false;
		System.out.println("Before return");
		if(f)
		{
			return;
		}
		System.out.println("This is execute");
	}
}
