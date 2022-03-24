package createObject;

public class CloneExample7 implements Cloneable
{
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	float a=10;
	float b=10;
	public static void main(String[] args) throws CloneNotSupportedException
	{
		CloneExample7 obj=new CloneExample7();
		try
		{
			CloneExample7 obj1=(CloneExample7) obj.clone();
			System.out.println(obj1.a/obj1.b);
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}
}
