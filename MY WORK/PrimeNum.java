//Check whether the number is prime or not
import java.util.*;
class PrimeNum
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	void check()
	{
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			System.out.println(n+" is a prime number");
		}
		else
		{
			System.out.println(n+" is not a prime number");
		}
	}
}