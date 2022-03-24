package charBuffer;

import java.nio.CharBuffer;
import java.nio.InvalidMarkException;

public class Reset 
{
	public static void main(String[] args) 
	{
		try
		{
			char c[]= {'S','o','n','u','k','u','m','a','r'};
			CharBuffer ch=CharBuffer.wrap(c);  //create object of CharBuffer and allocate the size of capacity
			ch.position(3);   //this is always less then mark after position because position is marked we can not access mark value mark position vlue
			ch.mark();			//set the mark position using mark method
			ch.position(4);  //try to set position at index 4
			System.out.println("Position befoe reset "+ch.position());
			ch.reset();		//try to call reset to restore //to the position we marked
			System.out.println("Position after reset "+ch.position());;
		}
		catch(InvalidMarkException e)
		{
			System.out.println("");
		}
	}
}
