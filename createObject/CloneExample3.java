package createObject;

public class CloneExample3 implements Cloneable
{
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	char a='A';
	public static void main(String[] args) throws CloneNotSupportedException
	{
		CloneExample3 obj=new CloneExample3();
		try
		{
			CloneExample3 obj1=(CloneExample3)obj.clone();
			System.out.println(obj1.a);
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}
}
