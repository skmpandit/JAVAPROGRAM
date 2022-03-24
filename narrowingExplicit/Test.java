package narrowingExplicit;
										/*Double -> Float -> long -> Int -> Short -> byte*/
public class Test {
	public static void main(String[] args)
	{
		double d=5434.5345;
		float f=(float)d;
		long l=(long)f;
		int i=(int)l;
		short s=(short)i;
		byte b=(byte)s;
		System.out.println("Double value: "+d);
		System.out.println("Float value: "+f);
		System.out.println("Long value: "+l);
		System.out.println("Int value: "+i);
		System.out.println("Short value: "+s);
		System.out.println("Byte value: "+b);
	}
}
