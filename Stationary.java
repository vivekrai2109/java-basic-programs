package shortprograms;

public class Stationary 
{
	Pen buyPen(double amt,String color)
	{
		System.out.println("buying a pen");
		Pen p1 =new Pen();
		p1.inkColor=color;
		return p1;
	}

}
