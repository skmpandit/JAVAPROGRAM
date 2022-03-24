package charBuffer;

import java.nio.CharBuffer;

public class SubSequence 
{
	public static void main(String[] args) 
	{
		try
		{
			char c[]= {'a','b','c','d','e'}; //Declare and initialize the char array
			CharBuffer ch=CharBuffer.wrap(c);   //Create object of CharBuffer 
			
		}
		catch(IndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
	}
}
