package charBuffer;

import java.nio.CharBuffer;
import java.nio.InvalidMarkException;

public class Reset1 
{
	public static void main(String[] args) 
	{
		try
		{
			char c[]= {'S','O','N','U'};
			CharBuffer ch=CharBuffer.wrap(c);  //Create object of CharBuffer and allocate the size of capacity
			ch.position(2);   //try to set position at index 2
			ch.mark();    // set this buffer mark position using marks method
			ch.position(1);   //try to set position at index 1
			System.out.println("Position before reset "+ch.position());
			ch.reset();  //try call the reset to restore // to position we marked
			System.out.println("Position After reset "+ch.position());
		}
		catch(InvalidMarkException e)
		{
			e.printStackTrace();
		}
	}
}
