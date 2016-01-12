/*The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million. */

public class LongestCollatzSequence {
	
	public static void main(String[] args)
	{
		int count=1;
		int num=1;
		long k=1;
		long j=1;
		long m=1;
		for (long i=2;i<1000000;i++)
		{
			if (i%2==0)
			{
				j=i;
				while (j>1)
				{
					if (j%2==0)
					{
						j=j/2;
					}
					else 
					{
						j=3*j+1;
					}
					count++;
				}
			}
			
			if (i%2==1)
			{
				m=i;
				while (m>1)
				{
					if (m%2==0)
					{
						m=m/2;
					}
					else 
					{
						m=3*m+1;
					}
					count++;
				}
			}
			if (count>=num)
			{
				num=count;
				k=i;
			}
			count = 0;
		}
		System.out.println(k + " " + num);
	}
}
