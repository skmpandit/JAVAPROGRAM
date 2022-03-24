package serializingAndDeserializing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp implements Serializable
{
	private static final long serialversionUID=324232L;
	transient int a;
	static int b;
	String name;
	int age;
	public Emp(String name,int age,int a,int b)
	{
		this.name=name;
		this.age=age;
		this.a=a;
		this.b=b;
	}
}
public class SerialExample1 
{
	public static void printdata(Emp obj1)
	{
		System.out.println("Name = "+obj1.name);
		System.out.println("Age = "+obj1.age);
		System.out.println("A = "+obj1.a);
		System.out.println("B = "+obj1.b);
	}
	public static void main(String[] args)
	{
		Emp obj=new Emp("Rajan Kumar Mahto",21,20,30);
		String filename="Sonu.txt";
		try
		{
			FileOutputStream file=new FileOutputStream(filename);
			ObjectOutputStream out=new ObjectOutputStream(file);
			out.writeObject(obj);
			out.close();
			file.close();
			System.out.println("Object has been Serialized \n"+"Data before Deserialized");
			printdata(obj);
			obj.b=2000;
			
		}
		catch(IOException ex)
		{
			System.out.println("IOException is caught");
		}
		obj=null;
		try
		{
			FileInputStream file=new FileInputStream(filename);
			ObjectInputStream in=new ObjectInputStream(file);
			obj=(Emp) in.readObject();
			in.close();
			file.close();
			System.out.println("Object has been Deserialized");
			printdata(obj);
			
		}
		catch(IOException ex)
		{
			System.out.println("IOException is caught");
		}
		catch(ClassNotFoundException ex)
		{
			System.out.println("ClassNotFoundException is caught");
		}
	}
}
