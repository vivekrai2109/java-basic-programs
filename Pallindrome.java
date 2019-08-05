package shortprograms;

public class Pallindrome {

	public static void main(String[] args) {
		
		int num1=626;
		int rev=0;
		int a;
		int n=num1;
		while (num1 > 0)
		{
			a= num1 % 10;
			rev= rev*10 +a;
			num1= num1 / 10;
		}
		if (rev == n)
		{
			System.out.println("It is a pallindrome");
		}
		else
		{
			System.out.println("It is not a pallindrome");
		}
	}

}
