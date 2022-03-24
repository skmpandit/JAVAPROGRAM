package createObject;

public class CloneExample5 implements Cloneable
{
	protected Object Clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	int a=40;
	int b=30;
	public static void main(String[] args) throws CloneNotSupportedException
	{
		CloneExample5 obj=new CloneExample5();
		try
		{
			CloneExample5 obj1=(CloneExample5) obj.clone();
			System.out.println(obj1.a-obj1.b);
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}
}
