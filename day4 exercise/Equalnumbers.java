import java.util.Scanner;
class Equalnumbers{
public static void main (String args[]){
Scanner num = new Scanner (System.in);
System.out.println("give your first number: ");
int num1 = num.nextInt();
System.out.println("give your second number: ");
int num2 = num.nextInt();
System.out.println("give your third number: ");
int num3 = num.nextInt();
System.out.println("give your fourth number: ");
int num4 = num.nextInt();
if(num1==num2 && num2==num3 && num3==num4 ){
System.out.println("numbers are equal");
}
else{
System.out.println("numbers are not equal");
}




}
}