/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that 
 * the 6th prime is 13. What is the 10001st prime number?
 */
public class NthPrime {

	public static void main(String[] args) {
		long val = returnPrime(10001);
		System.out.println(val);

	}
	
	public static long returnPrime(int nth)
	{
		long number = 12131331L;
		int count=1;
		long n=0;
		for (long i=3;i<=number;i++)
		{
			if (checkPrime(i))
			{
				count++;
				n=i;
			}
			if (count==nth)
			{
				break;
			}
		}
		return n;
	}
	
	public static boolean checkPrime (long num)
	{
		for (long i=2;i<=Math.sqrt(num);i++)
		{
			if (num%i==0)
			{
				return false;
			}
		}
		return true;
	}
}