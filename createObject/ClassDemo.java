package createObject;
import java.util.*;
import java.lang.*;
public class ClassDemo 
{
	public static void main(String[] args)
	{
		try
		{
			Date d=new Date();
			Class cls=d.getClass();
			System.out.println("Time ="+d.toString());
			Object obj=cls.newInstance();
			System.out.println("Time = "+obj);
		}
		catch(InstantiationException e)
		{
			System.out.println(e.toString());
		}
		catch(IllegalAccessException e)
		{
			System.out.println(e.toString());
		}
	}
}
