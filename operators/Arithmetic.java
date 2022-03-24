package operators;

public class Arithmetic {
	public static void main(String[] args)
	{
		//int a=10;
		//int b=10;
		//int c=a+b*a+a*b/a*b-a;
		//System.out.println(c);
		
		//int e=a*a+2*a*b+b*b;
		//int f=(a+b)*(a+b);
		//System.out.println(e);
		//System.out.println(f);
		
		//int l=10;
		//int k=l++;
		//int m=++l;
		//System.out.println(l);
		//System.out.println(k);
		//System.out.println(m);
		
		//int t=10;	/*1010   ->>   0101  ->	0010	->	0000	->	0000*/
		//int p=t>>2;
		//System.out.println(p);
		
		int a=4;
		a%=2;
		System.out.println(a);
		
		int b=6;
		b>>=2;
		System.out.println(b);
		
		int c=8;
		c<<=3;
		System.out.println(c);
		
		int d=10;	/*1010	0010*/
		d&=2;
		System.out.println(d);
		
		int f=10;
		f|=2;
		System.out.println(f);
	}
}
