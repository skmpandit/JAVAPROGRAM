package serializingAndDeserializing;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserializing 
{
	public static void main(String[] args)
	{
		try
		{
			Deserializing t;
			FileInputStream f=new FileInputStream("file.txt");
			//ObjectInputStream oss=new ObjectInputStream(d);
			//d=(Deserializing) oss.readObject();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//System.out.println(d.name);
	}
}
