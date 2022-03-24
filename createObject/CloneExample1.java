package createObject;

public class CloneExample1 implements Cloneable
{	
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	String name="Rajen Kumar";
	public static void main(String[] args)
	{
		CloneExample1 obj1=new CloneExample1();
		try
		{
			CloneExample1 obj2=(CloneExample1) obj1.clone();
			System.out.println(obj2.name);
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}
}
