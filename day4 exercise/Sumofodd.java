import java.util.Scanner;
class Sumofodd{
public static void main(String args[]){
Scanner num = new Scanner (System.in);
System.out.println("Enter a starting number:");
int n1 = num.nextInt();
System.out.println("Enter a ending number:");
int n2 = num.nextInt();
int sum=0;
for(int i=n1 ; i<=n2 ; i++){
if(i%2!=0){
System.out.println(i);
sum=sum+i;
}
}
System.out.println("Sum of the odd numbers from the given range :"+sum);

}
}