package createObject;
class Test23
{
	int x,y;
}
class CloneDeep implements Cloneable
{
	int a,b;
	Test23 t=new Test23();
	public Object clone() throws CloneNotSupportedException
	{
		CloneDeep t1=(CloneDeep) super.clone();
		t1.t.x=t.x;
		t1.t.y=t.y;
		return t;
	}
}
public class CloneDeepCopy
{
	public static void main(String[] args) throws CloneNotSupportedException
	{
		CloneDeep t2=new CloneDeep();
		t2.a=10;
		t2.b=20;
		t2.t.x=300;
		t2.t.y=400;
		CloneDeep t3=(CloneDeep) t2.clone();
		t3.a=1000;
		t3.t.x=2000;
		System.out.println(t2.a+" "+t2.b+" "+t2.t.x+" "+t2.t.y);
		System.out.println(t3.a+" "+t3.b+" "+t3.t.x+" "+t3.t.y);
	}
}
