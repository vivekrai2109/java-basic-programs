package shortprograms;

public class Student 
{

	public static void main(String[] args) 
	{
		System.out.println("Student mark sheet program");
		int sub1=70,sub2=70,sub3=70,sub4=70,sub5=70,sub6=70;
		double percentage,sum;
		int total=600;
		sum=sub1+sub2+sub3+sub4+sub5+sub6;
		percentage=(sum/total)*100;
		if(sub1<35 || sub2<35 || sub3<35 || sub4<35 || sub5<35 || sub6<35)
		{
			System.out.println("FAILED!!!");
			
		}
		else if(percentage >= 70)
		{
			System.out.println("First class with distinction");
		}
		else if(percentage >= 60)
		{
			System.out.println("First class");
		}
		else if(percentage >= 50)
		{
			System.out.println("Second class");
		}
		else
		{
			System.out.println("Just pass");
		}
	}

}
