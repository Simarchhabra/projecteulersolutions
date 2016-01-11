/*If we list all the natural numbers below 10 that are multiples of 3 or 5
* we get 3, 5, 6 and 9. The sum of these multiples is 23.
* Find the sum of all the multiples of 3 or 5 below 1000. */

public class ThreeFiveMultiples {

	public static void main(String[] args) {
		int x = add_multiples(1000); //stores add_multiples value for 1000
		System.out.println(x);;
	}
	
	public static int add_multiples(int num) //adds multiples of 3 or 5 below num
	{
		int sum=0;
		for (int i=3;i<num;i++)
		{
			if (i%3==0 || i%5==0)
			{
				sum+=i;
			}
		}
		return sum;
	}

}
