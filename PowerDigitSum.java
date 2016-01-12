/* 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * What is the sum of the digits of the number 2^1000? */
import java.math.BigInteger; 
public class PowerDigitSum {
	public static void main(String[] args)
	{
        BigInteger result = BigInteger.ONE;
        for (int i=1;i<=1000;i++)
		{
		result = result.multiply(BigInteger.valueOf(2));
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
