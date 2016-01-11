/*
 * The sum of the squares of the first ten natural numbers is, 
 * 1^2 + 2^2 + ... + 10^2 = 385. 
 * The square of the sum of the first ten natural numbers is,
 * (1 + 2 + ... + 10)^2 = 552 = 3025.
 * Hence the difference between the sum of the squares of the first ten natural numbers 
 * and the square of the sum is 3025 − 385 = 2640.Find the difference between the sum of
 * the squares of the first one hundred natural numbers and the square of the sum.
 */
public class SumSquareDifference {

	public static void main(String[] args) {
		
		int difference = squareSum(100)-sumSquare(100);
		System.out.println(difference);
		
	}
	
	public static int sumSquare (int num)
	{
		int n=0;
		for (int i=1;i<=num;i++)
		{
			n+=i*i;
		}
		return n;
	}
	public static int squareSum (int num)
	{
		int n=0;
		for (int i=1;i<=num;i++)
		{
			n+=i;
		}
		return n*n;
	}	

}
