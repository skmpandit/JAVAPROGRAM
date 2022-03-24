package serializingAndDeserializing;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serializing implements Serializable
{
		private String name;
		Serializing(String name)
		{
			this.name=name;
		}
		public static void main(String[] args)
		{
			try
			{
				Serializing t=new Serializing("Sonu Kumar Mahto");
				FileOutputStream f=new FileOutputStream("file.txt");
				ObjectOutputStream oss=new ObjectOutputStream(f);
				//oss.writeObject(d);
				oss.close();
				f.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
}
