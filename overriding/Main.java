package overriding;
class Parent
{
	void show()
	{
		System.out.println("Parent's show()");
	}
}
class Child extends Parent
{
	void show()
	{
		System.out.println("Child's show()");
	}
}
public class Main 
{
	public static void main(String[] args)
	{
		Parent obj1=new Parent();
		obj1.show();
		Child obj2=new Child();
		obj2.show();
	}
}
