package farwordDeclaration;

public class FarwordDeclaration 
{
	public static void main(String[] args)
	{
		test t=new test();
		t.fun(5);
	}
}
class test
{
	void fun(int i)
	{
		System.out.println("Void fun() called i = "+i);
	}
}
