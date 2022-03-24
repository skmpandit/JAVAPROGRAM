package createObject;

public class CloneExample4 implements Cloneable
{	
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	int a=10;
	int b=10;
	public static void main(String[] args) throws CloneNotSupportedException
	{
		CloneExample4 obj=new CloneExample4();
		try
		{
			CloneExample4 obj1=(CloneExample4) obj.clone();
			System.out.println(obj1.a+obj1.b);
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}
}
