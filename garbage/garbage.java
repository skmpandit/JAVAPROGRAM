package garbage;

public class garbage
{
	public static void main(String[] args) throws InterruptedException
	{
		garbage t1 = new garbage(); 	          
	        
	    t1 = null; 
	          
	    System.gc();       
	        
	}
	protected void finalize() throws Throwable
	{
		System.out.println("garbage collector run"+this);
	}
}
