import java.util.*;

	public class AmicableNumbers {

		public static void main(String[] args) {
			int value = find_amicable(10000); //stores val
			System.out.println("" + value);
		}
		public static int find_amicable(int num) //adds amicable numbers below specified parameter
		{
			ArrayList<Integer> numbers = new ArrayList<Integer>();
			int n=0;
			for (int i=2;i<num;i++)
			{
				for (int j=1;j<i;j++)
				{
					if (check_amicable(i,j))
					{
						numbers.add(i);
						numbers.add(j);
					}
				}
			}
			for (int k=0;k<numbers.size();k++)
			{
				n+=numbers.get(k);
			}
			return n;
		}
		
		public static boolean check_amicable(int m, int n) //checks if two numbers are amicable pairs
		{
			if (sum_divisor(m)==n && sum_divisor(n)==m)
			{
				return true;
			}
			return false;
		}

		public static int sum_divisor(int num) //adds the sum of all proper divisors
		{
			int n = (int)Math.sqrt(num);
		    int sum=1;
		    for(int i = 2; i <= n; i++)
		    {
		        if(num % i == 0)
		        {
		           sum += i;
		           int val = num/i;
		           if(val!=i)
		              sum+=val;
		        }
		    }
		    return sum;
		}
	}
