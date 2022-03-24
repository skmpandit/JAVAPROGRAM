package inheritance;
class one
{
	public void print()
	{
		System.out.println("Sonu");
	}
}
class two extends one
{
	public void printA()
	{
		System.out.println("Kumar");
	}
}
public class SingleInheritance 
{
	public static void main(String[] args) {
		two t=new two();
		t.print();
		t.printA();
	}
}
