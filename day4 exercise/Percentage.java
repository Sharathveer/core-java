import java.util.Scanner;
import java.util.*;
class Percentage{
public static void main(String args[]){
Scanner marks = new Scanner(System.in);
System.out.println("enter your theory marks :");
int tmarks=marks.nextInt();
System.out.println("enter your total practical marks:");
int pmarks=marks.nextInt();
System.out.println(" enter your total marks:" );
int ttmarks=marks.nextInt();
int percentage = ((tmarks+pmarks)*100)/ttmarks;
System.out.println("percentage of marks:"+percentage);
if(percentage>50){
System.out.println("you are eligible for this job");
}
else{
System.out.println("you are not eligible for this job");
}


}
}
