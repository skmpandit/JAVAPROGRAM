package narrowingExplicit;

public class Test1 
{
	public static void main(String[] args)
	{
		byte b;
		byte b1;
		int i=257;
		double d=536.3645;
		System.out.println("Conversion of int to byte");
		b=(byte)i;  //i%256
		System.out.println("Int = "+i+" Byte = "+b);
		System.out.println("Conversion of double to byte");
		b1=(byte)d;   //d%256
		System.out.println("Double = "+d+" Byte = "+b1);
	}
}
