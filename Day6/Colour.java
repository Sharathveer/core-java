import java.util.*;
public class Colour{

public static void main(String args[]){

Random rand=new Random();
int r=rand.nextInt(256);
int g=rand.nextInt(256);
int b=rand.nextInt(256);

System.out.println("RGB values are: " +r+ " " +g+ " " +b  );
if(r==0 &&  g==0 && b==0)    //  1colour
{
System.out.println("black");
}
if(r==256 && g==0 && b==0)   // 2colour
{
System.out.println("red");
}
if(r==0 && g==0 && b==256)  // 3colour
{
System.out.println("blue");
}
if(r==256 && g==256 && b==256)  // 4colour
{
System.out.println("white");
}
if(r==102 && g==255 && b==102) // 5colour
{
System.out.println("very light Green");
}
if(r==51 && g==153 && b==255) // 6colour
{
System.out.println("light blue");
}
if(r==255 && g==51 && b==51) // 7colour
{
System.out.println("light red");
}
if(r==0 && g==0 && b==128) // 8colour
{
System.out.println("navy blue");
}
if(r==135 && g==206 && b==235) // 9colour
{
System.out.println("sky blue");
}
if(r==165 && g==42 && b==42) // 10colour
{
System.out.println("brown");
}

}
}