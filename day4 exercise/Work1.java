import java.util.Scanner;
class Work1{

public static void main(String args[]){
Scanner in = new Scanner(System.in);
System.out.println("input number:");
int a = in.nextInt();
if(a>0){
System.out.println("number is positive");
}
else if(a<0){
System.out.println("number is negative");
}
else{
System.out.println("number is zero");
}


}
}