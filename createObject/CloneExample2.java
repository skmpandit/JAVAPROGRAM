package createObject;

public class CloneExample2 implements Cloneable
{	
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	int i=10;
	public static void main(String[] args)
	{
		CloneExample2 obj1=new CloneExample2();
		try
		{
			CloneExample2 obj=(CloneExample2) obj1.clone();
			System.out.println(obj.i);
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}
}
