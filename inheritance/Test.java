package inheritance;
class Bicyle
{
	public int gear;
	public int speed;
	public Bicyle(int gear,int speed)
	{
		this.gear=gear;
		this.speed=speed;
	}
	public void applyBrake(int decrement)
	{
		speed-=decrement;
	}
	public void speedup(int increment)
	{
		speed+=increment;
	}
	public String tostring()
	{
		return("No of gear are "+gear+"\nspeed of bicyle is "+speed);
	}
}
class MountainBike extends Bicyle
{
	public int seatHeight;
	public MountainBike(int gear,int speed,int startHeight)
	{
		super(gear,speed);
		seatHeight=startHeight;
	}
	public void setHeight(int newValue)
	{
		seatHeight=newValue;
	}
	public String tostring()
	{
		return(super.tostring()+"\nseatHeight is "+seatHeight);
	}
}
public class Test 
{
	public static void main(String[] args) {
		MountainBike mb=new MountainBike(3,100,25);
		System.out.println(mb.tostring());
	}
}
