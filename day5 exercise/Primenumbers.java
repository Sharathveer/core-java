import java.util.Scanner;
class Primenumbers{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
int num = sc.nextInt();
int i=1;
int fact=0;
while(i<=num)
{
if(num%i==0)
{
System.out.println(i);
fact++;
}
i++;
}
if (fact==2)
{
System.out.println("it is prime number");
}
else{
System.out.println("it is not a prime number");
} 





}
}