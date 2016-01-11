/*The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ? */
import java.util.*;
public class LargestPrimeFactor {

	public static void main(String[] args) {
		long x = largestPrimeFactor((long) 600851475143L);
		System.out.println(x);
	}
	
	public static Long largestPrimeFactor(Long j) {
		long m=0;
	    long n = j;
	    List<Long> primes = new ArrayList<Long>();
	    for (long i = 2L; i <= n; i++) {
	      while (n % i == 0) {
	        primes.add(i);
	        n /= i;
	      }
	    }
	    for (int k=0;k<primes.size();k++)
	    {
	    	if (primes.get(k)>m)
	    	{
	    		m=primes.get(k);
	    	}
	    }
	    return m;
	}
}