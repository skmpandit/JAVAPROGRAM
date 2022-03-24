package overriding;

class Parent12
{
	void show()
	{
		System.out.println("Parent show()");
	}
}
class Child12 extends Parent12
{
	void show()
	{
		super.show();
		System.out.println("Child's show()");
	}
}

public class Invoking 
{
	public static void main(String[] args) {
		Parent12 obj=new Child12();
		obj.show();
	}
}
