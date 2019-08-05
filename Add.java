package shortprograms;

public class Add {
	
	static void add(int a, int b)
	{
		int sum;
		System.out.println(" two no's is :" + a +" and "+ b);
		sum= a + b;
		System.out.println(" sum is :"+ sum);
	}
	public static void main(String[] args) {
		System.out.println(" Addition Starts");
		add(5,6);
		System.out.println(" Addition Complete");
	}

}
