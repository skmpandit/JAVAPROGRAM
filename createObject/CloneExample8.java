package createObject;
class Test12
{
	int x,y;
	Test12()
	{
		x=5;
		y=20;
	}
}
public class CloneExample8
{
	public static void main(String[] args)
	{
		Test12 obj1=new Test12();
		System.out.println(obj1.x+" "+obj1.y);
		Test12 obj2=obj1;
		obj2.x=100;
		obj2.y=200;
		System.out.println(obj1.x+" "+obj1.y);
		System.out.println(obj2.x+" "+obj2.y);
	}
}
