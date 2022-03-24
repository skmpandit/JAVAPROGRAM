package createObject;
 
public class CloneExample6 implements Cloneable
{
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	int a=20;
	int b=40;
	public static void main(String[] args)
	{
		CloneExample6 obj=new CloneExample6();
		try
		{
			CloneExample6 obj1=(CloneExample6) obj.clone();
			System.out.println(obj1.a*obj1.b);
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}
}
