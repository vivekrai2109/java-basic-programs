package shortprograms;

public class Equilateral {

	public static void main(String[] args) {
		int x= 45;
		int y= 90;
		int z= 46;
		
		if((x+y>z) && (y+z>x) && (z+x>y))
		{
			if((x==y) && (x==z) && (y==z))
			{
				System.out.println(" An Equilateral traingle ");
			}
			else
			{
				System.out.println(" Not an Equilateral traingle ");
			}
		}

	}

}
