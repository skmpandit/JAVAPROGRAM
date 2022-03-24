package garbage;

public class garbage1 {
	public static void main(String[] args)
	{
		garbage1 g=new garbage1();
		g=null;
		Runtime.getRuntime().gc();
		
	}
	protected void finalize() throws Throwable
	{
		System.out.println("Garbage collector called");
		System.out.println("\nObject garbage collected "+this);
	}
}
