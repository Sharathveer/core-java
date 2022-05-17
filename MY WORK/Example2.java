//Printing the factors of a number
import java.util.*;
class Factors
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	void PrintFactors()
	{
		System.out.println("Factors are: ");
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i);
			}
		}
	}
}
public class Example2
{
	public static void main(String args[])
	{
		Factors obj=new Factors();
		obj.PrintFactors();
	}
}