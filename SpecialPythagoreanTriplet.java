/*A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a2 + b2 = c2. For example, 32 + 42 = 9 + 16 = 25 = 52. 
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */

public class SpecialPythagoreanTriplet {
	final static int CONSTANT = 1000;

	public static void main(String[] args) {
		int product=0;
		for (int a=0;a<=CONSTANT;a++)
		{
			for (int b=0;b<=CONSTANT; b++)
			{
				for (int c=0;c<=CONSTANT;c++)
				{
					if (checkPythagorean(a,b,c))
					{
						int n=addPythagorean(a,b,c);
						if (n==CONSTANT)
						{
							product=a*b*c;
						}

					}
				}
			}
		}
		System.out.println(product);
	}
	
	public static int addPythagorean (int a,int b, int c)
	{
		int n = a+b+c;
		return n;
	}
	
	public static boolean checkPythagorean (int a, int b, int c)
	{
		if (a*a+b*b==c*c && a<b && b<c)
		{
			return true;
		}
		return false;
	}

}
