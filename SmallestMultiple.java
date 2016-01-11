/*2520 is the smallest number that can be divided by each of the numbers 
 * from 1 to 10 without any remainder. What is the smallest positive number that 
 * is evenly divisible by all of the numbers from 1 to 20? */

public class SmallestMultiple {
	final static long CONSTANT = 1844674407370955111L;

	public static void main(String[] args) {
	long n=0L;
	for (long i=2520;i<=CONSTANT;i++)
	{
		if(check_if_divisible(i))
		{
			n=i;
			break;
		}
	}
	System.out.print(n);
}
	
	public static boolean check_if_divisible(long num)
	{
		for (int i=1;i<=20;i++)
		{
			if (num%i!=0)
			{
				return false;
			}
		}
		return true;
	}
	

}
