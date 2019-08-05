package shortprograms;

public class Armstrong {

	public static void main(String[] args) {
		
		int num1=407;
		int temp;
		int a;
		int sum = 0;
		temp= num1;
		
		while(temp!= 0)
		{
			a = temp%10;
			sum =sum+a*a*a;
			temp= temp/10;
		}
		if (num1 == sum)
		{
			System.out.println("it is an armstrong no.");
		}
		else
		{
			System.out.println("it is not an armstrong no.");
		}
		
	}

}
