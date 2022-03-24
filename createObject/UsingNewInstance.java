package createObject;

public class UsingNewInstance 
{
	String name="Sonu Kumar Mahto";
	public static void main(String[] args)
	{
	try
		{
		 	Class cls=Class.forName("UsingNewInstance");
		 	@SuppressWarnings("deprecation")
			UsingNewInstance obj=(UsingNewInstance)cls.newInstance();
		 	System.out.println(obj.name);
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(InstantiationException e)
		{
			e.printStackTrace();
		}
		catch(IllegalAccessException e)
		{
			e.printStackTrace();
		}
	}
}
