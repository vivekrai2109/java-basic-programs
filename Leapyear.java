package shortprograms;

public class Leapyear {

	public static void main(String[] args) {
		 int num1=2005;
		 boolean leap=false;
		 
		 if(num1 % 400==0)
		 {
			 leap=true;
		
		 }
		 else if(num1%100==0)
		 {
			 leap=false;
		 }
		 else if(num1%4==0)
		 {
			 leap=true;
		 }
		 else 
		 {
			 leap=false;
		 }
		 if(leap==true)
		 {
			 System.out.println(" leap year");
		 }
		 else
		 {
			 System.out.println(" not a leap year");
		 }
}
}