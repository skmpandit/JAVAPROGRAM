package inheritance;
class Fruit
{
	public Fruit()
	{
		System.out.println("Super class constructor");
		System.out.println("Super class object hashCode:"+this.hashCode());
		System.out.println(this.getClass().getName());
	}
}
class Apple extends Fruit
{
	public Apple()
	{
		System.out.println("Sub class constructor invoked");
		System.out.println("Sub class object hashCode:"+this.hashCode());
		System.out.println(this.hashCode()+" "+super.hashCode());
		System.out.println(this.getClass().getName()+" "+super.getClass().getName());
	}
}
public class Test1 {
	public static void main(String[] args) {
		Apple myApple=new Apple();
	}
}
