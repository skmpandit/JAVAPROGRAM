package serializingAndDeserializing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Dem implements java.io.Serializable
{
	public int a;
	public String b;
	public Dem(int a,String b)
	{
		this.a=a;
		this.b=b;
	}
}
class Test
{
	public static void main(String[] args)
	{
		Dem obj=new Dem(1,"Sonu Kumar Mahto");
		String filename="file.ser";
		try
		{
			FileOutputStream file=new FileOutputStream(filename);
			ObjectOutputStream out=new ObjectOutputStream(file);
			out.writeObject(obj);
			out.close();
			file.close();
			System.out.println("Object has been serialiazed");
		}
		catch(IOException ex)
		{
			System.out.println("IOException is caught");
		}
		Dem obj1=null;
		try
		{
			FileInputStream file=new FileInputStream(filename);
			ObjectInputStream in=new ObjectInputStream(file);
			obj1=(Dem) in.readObject();
			in.close();
			file.close();
			System.out.println("Object has been deserialization");
			System.out.println("a = "+obj1.a);
			System.out.println("b = "+obj1.b);
		}
		catch(IOException ex)
		{
			System.out.println("IOException is caught");
		}
		catch(ClassNotFoundException ex)
		{
			System.out.println("ClassNotFoundException");
		}
	}
}
