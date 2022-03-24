package inheritance;
interface one2
{
	public void print();
}
interface two2
{
	public void printA();
}
interface three2 extends one2,two2
{
	public void print();
}
class child implements three2
{
	public void print()
	{
		System.out.println("Sonu");
	}
	public void printA()
	{
		System.out.println("Kumar");
	}
}
public class Multiple {
	public static void main(String[] args) {
		child c=new child();
		c.print();
		c.printA();
	}
}
