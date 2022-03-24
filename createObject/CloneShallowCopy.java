package createObject;

class Test13
{
	int y,x;
}
class Test14 implements Cloneable
{
	int a,b;
	Test13 t=new Test13();
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
public class CloneShallowCopy 
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		Test14 t1=new Test14();
		t1.a=10;
		t1.b=30;
		t1.t.x=40;
		t1.t.y=60;
		Test14 t2=(Test14) t1.clone();
		t2.a=100;
		t2.t.x=300;
		System.out.println(t1.a+" "+t1.b+" "+t1.t.x+" "+t1.t.y);
		System.out.println(t2.a+" "+t2.t.x+" "+t2.t.y+" "+t2.b);
	}
}
