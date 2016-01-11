/* A palindromic number reads the same both ways. The largest palindrome 
 * made from the product of two 2-digit numbers is 9009 = 91 × 99. 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class LargestPalindrome {
	
	public static void main (String[] args)
	{
		int x = largestPalindrome();
		System.out.println(x);
		
	}
	public static int largestPalindrome()
	{
		int n=0;
		int largest=0;
		for (int i=100;i<=999;i++)
		{
			for (int j=100;j<=999;j++)
			{
				n=i*j;
				if (checkPalindrome(n))
				{
					if (n>largest)
					{
						largest=n;
					}
				}
			}
		}
		return largest;
	}
	
	public static boolean checkPalindrome(int num)
	{
		int newnum=num;
		int n=0;
		while (newnum>0) 
		{
			n=n*10+newnum%10; 
			newnum=newnum/10; 
		}
		if (n==num)
		{
			return true;
		}
		return false;
	}

}
