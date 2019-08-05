package shortprograms;

public class LCM {

	public static void main(String[] args) {
		int x= 6;
		int y= 9;
		int max;
		int min;
		
		if(x>y)
		{
			max=x;
			min=y;
		}
		else
		{
			max=y;
			min=x;
		}
		for(int i=1;i<=min; i++)
		{
		if(((max*i) % min==0))
		{
		System.out.println(" LCM IS : "+ (max*i));
		break;
		}

	}
	}
}
