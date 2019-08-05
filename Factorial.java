package shortprograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner scn1 = new Scanner(System.in);
		System.out.println(" enter the no :");
		int num1= scn1.nextInt();
		int c;
		int fact= 1;
		
		if (num1 < 0)
		{
			System.out.println(" number should be non-negative");
		}
		else
		{
			for(c=1; c<=num1; c++)
				fact= fact*c;
			System.out.println(" Factorial of a no. is : " +fact);
		}
			
	}
}
