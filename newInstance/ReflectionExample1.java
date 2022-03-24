package newInstance;

import java.lang.reflect.Constructor;

public class ReflectionExample1 
{
	private String name;
	ReflectionExample1()
	{
		
	}
	void setName(String name)
	{
		this.name=name;
	}
	public static void main(String[] args)
	{
		try
		{
		Constructor<ReflectionExample1>constructor=ReflectionExample1.class.getDeclaredConstructor();
		ReflectionExample1 r=constructor.newInstance();
		r.setName("Rajan Kumar Mahto");
		System.out.println(r.name);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
