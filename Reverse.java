import java.util.Scanner;
class Reverse{
public static void main(String args[]){
int n,num,r,
rev = 0;
Scanner K=new Scanner(System.in);
System.out.println("enter number");
n = K.nextInt();
num = n;
while(num > 0)
{
r=num % 10;
rev = (rev * 10)+r;
num = num/10;
}
System.out.println("reverse of number="+rev);


}
}	