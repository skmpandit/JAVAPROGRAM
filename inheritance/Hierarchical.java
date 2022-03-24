package inheritance;
class A
{
	public void printA()
	{
		System.out.println("Class A");
	}
}
class B extends A
{
	public void printB()
	{
		System.out.println("Class B");
	}
}
class C extends A
{
	public void printC()
	{
		System.out.println("Class C");
	}
}
class D extends A
{
	public void printD()
	{
		System.out.println("Class D");
	}
}
public class Hierarchical 
{
	public static void main(String[] args) 
	{
		B obj_b=new B();
		obj_b.printA();
		obj_b.printB();
		C obj_C=new C();
		obj_C.printA();
		obj_C.printC();
		D obj_D=new D();
		obj_D.printA();
		obj_D.printD();
	}
}
