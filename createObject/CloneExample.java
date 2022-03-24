package createObject;

public class CloneExample implements Cloneable
{
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	String name="Souu Kumar Mahto";
	public static void main(String[] args)
	{
		CloneExample obj1=new CloneExample();
		try
		{
			CloneExample obj2=(CloneExample) obj1.clone();
			System.out.println(obj2.name);
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}
}
