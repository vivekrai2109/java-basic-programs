package shortprograms;

public class NCR {
	
	static void ncr(int a, int b)
	{
		System.out.println(" NCR STARTED");
		int fact= 1;
		int fact1=1;
		int fact2=1;
		 
		if (a < 0 && b < 0)
		{
			System.out.println(" number should be non-negative");
		}
		else
		{
			for(int i=1; i<=a; i++)
			{
				fact= fact*i;
			}
			for(int j=1; j<=b;j++)
			{
				fact1= fact1*j;
			}
			int c= a-b;
			for (int k=1; k<= c; k++)
			{
				fact2= fact2*k;
			}
			int x;
			x = (fact/(fact1*(fact2)));
			System.out.println(" NCR VALUE IS  : " + x);	
		}
	}

	public static void main(String[] args) {
	
		System.out.println(" STARTED");
		ncr(4,2);
		System.out.println(" FINISHED");
	}

}
