package shortprograms;

public class Swap {
	 
	static void swap(int a, int b)
	{
		System.out.println(" No. before swapping : "+a +" and "+  b);
		a=b-a+(b=a);
		System.out.println(" No. after swapping  : "+a +" and "+ b);
	}

	public static void main(String[] args) {
	
		swap(5,6);
		System.out.println(" Swapped ");
	}

}
