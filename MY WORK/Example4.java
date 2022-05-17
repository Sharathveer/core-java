//Check whether the number is perfector not
import java.util.Scanner;  
class PerfectNumber  
{  
		void CheckPerfectNumber()    
		{  
			long n, sum=0;  
			Scanner s=new Scanner(System.in);         
			System.out.print("Enter the number: ");  
			n=s.nextLong();    
			for(int i=1;i<=n/2;i++)
			{  
					if(n % i == 0)  
					{  
						sum = sum + i;  
					}    
			} 
			if(sum==n)  
			{  
					System.out.println(n+" is a perfect number.");  
			}  
			else  
			{
				System.out.println(n+" is not a perfect number.");  
			}
		}  
}
public class Example4
{
	public static void main(String args[])
	{
		PerfectNumber obj=new PerfectNumber();
		obj.CheckPerfectNumber();
	}
}