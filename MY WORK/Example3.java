//Checking the eligibility to vote 
import java.util.*;
class Voting
{
	Scanner s=new Scanner(System.in);
	void CheckEligibility()
	{
		System.out.println("Enter your age: ");
		int n=s.nextInt();
		if(n>=18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			System.out.println("Not Eligible to vote");
		}
	}
}
public class Example3
{
	public static void main(String args[])
	{
		Voting obj=new Voting();
		obj.CheckEligibility();
	}
}