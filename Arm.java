package shortprograms;
import java.util.Scanner;
public class Arm 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		int num,r,sum=0;
		System.out.println("Armstrong number program");
		System.out.println("enter the number to check whether number is armstrong or not");
		Scanner scn1=new Scanner(System.in);
		num = scn1.nextInt();
		
		int temp=num;
		while(temp!=0)
		{
			r=temp%10;
			sum=sum+r*r*r;
			temp=temp/10;
		}
		if(sum == num)
		{
			System.out.println("entered number is armstrong");
		}
		else
		{
			System.out.println("entered number is not armstrong");
		}
	}

}
