package serializingAndDeserializing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Demo implements java.io.Serializable
{
	public String dep;
	public String name;
	public int roll;
	Demo(String dep,int roll,String name)
	{
		this.dep=dep;
		this.name=name;
		this.roll=roll;
	}
}
public class Test1 
{
	public static void main(String[] args)
	{
		Demo obj=new Demo("BCA",1,"Sonu Kumar Mahto");
		String filename="file.ser";
		try
		{
			FileOutputStream file=new FileOutputStream(filename);
			ObjectOutputStream out=new ObjectOutputStream(file);
			out.writeObject(obj);
			out.close();
			file.close();
			System.out.println("Object has been serialized");
		}
		catch(IOException ex)
		{
			System.out.println("OIException is caught");
		}
		Demo obj1=null;
		try
		{
			FileInputStream file=new FileInputStream(filename);
			ObjectInputStream in=new ObjectInputStream(file);
			obj1=(Demo) in.readObject();
			in.close();
			file.close();
			System.out.println("Object has been Deserialized");
			System.out.println("department = "+obj1.dep);
			System.out.println("Name = "+obj1.name);
			System.out.println("Roll = "+obj1.roll);
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
