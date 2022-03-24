package inheritance;
class one1
{
	public void print()
	{
		System.out.println("Sonu");
	}
}
class two1 extends one
{
	public void printA()
	{
		System.out.println("Kumar");
	}
}
class three extends two1
{
	public void printB()
	{
		System.out.println("Mahto");
	}
}
public class Multilevel 
{
	public static void main(String[] args) 
	{
		three g=new three();
		g.print();
		g.printA();
		g.printB();
	}
}
