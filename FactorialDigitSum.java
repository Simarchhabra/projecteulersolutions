/*n! means n × (n − 1) × ... × 3 × 2 × 1
 * For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
 * and the sum of the digits in the number 10! is 
 * 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 * Find the sum of the digits in the number 100! */
import java.math.BigInteger;

public class FactorialDigitSum {
	
	public static void main(String[] args)
	{
        BigInteger result = BigInteger.ONE;
        for (int i=1;i<=100;i++)
		{
		result = result.multiply(BigInteger.valueOf(i));
		}
        BigInteger newresult = result;
        BigInteger newnewresult = BigInteger.ZERO;
        while (newresult.compareTo(BigInteger.ZERO) > 0) {
        
        newnewresult=newnewresult.add(newresult.mod(BigInteger.TEN));
        newresult = newresult.divide(BigInteger.valueOf(10));

        }
		System.out.println(newnewresult);
	}
}
