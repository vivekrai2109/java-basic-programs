package shortprograms;

public class Constructor 
{
	int empID;
	String empNAME;
	double empSALARY;
	Constructor(int arg1)
	{
		System.out.println("initializing employee id");
		empID = arg1;
	}
	
	Constructor(String arg2)
	{
		System.out.println("initializing employee name");
		empNAME = arg2;
	}
	
	Constructor(double arg3)
	{
		System.out.println("initializing employee salary");
		empSALARY=arg3;
	}

}
