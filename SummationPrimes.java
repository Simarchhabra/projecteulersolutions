/*The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.*/


public class SummationPrimes {

	public static void main(String[] args) {
		
		long sum = sumPrime(2000000);
		System.out.println(sum);

	}
	
	public static long sumPrime(long num)
	{
		long n=0;
		for (long i=2;i<=num;i++)
		{
			if (checkPrime(i))
			{
				n+=i;
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
