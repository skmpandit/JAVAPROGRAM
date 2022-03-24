package createObject;
class A
{
	int a;
}
class B
{
	int b;
}
public class Test 
{
	public static void fun(String c) throws InstantiationException, 
	IllegalAccessException, ClassNotFoundException
	{
		Object obj=Class.forName(c).newInstance();
		System.out.println("Object created for class :"+obj.getClass().getName());
	}
	public static void main(String[] args) throws InstantiationException,
	IllegalAccessException, ClassNotFoundException
	{
		fun("A");
	}
}
