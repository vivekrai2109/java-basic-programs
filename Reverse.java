package shortprograms;

public class Reverse {

	public static void main(String[] args) {
		
		int num1=497;
		int reverse=0;
		
		while( num1!=0 )
		{
			reverse = reverse*10;
			reverse =reverse+ num1 %10;
			num1= num1/10;
			
			System.out.println("REVERSE A STRING : "+ reverse);
		}

	}

}
