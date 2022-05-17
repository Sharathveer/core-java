class Types
{
public static void main(String args[]){

double dradius=33.123456789012347;
System.out.println(dradius);
/*
float radius=34.4545F;
System.out.println(radius);

/*
long num=1234567891011L;
System.out.println(num);




/*
char c='A';//letters
System.out.println(c);
System.out.println((byte)c);
c= 97;//single digit
System.out.println(c);
c='\n';//\t,\b,\n special characters
System.out.println(c);
c='#';//characters
System.out.println(c);
//two character sets{unicode which is super set of ASCII}
c='\u0067';
System.out.println(c);
c=10+20;
System.out.println(c);


/*
byte b = 10;
short s = 10;
//short total = b + s;//Widening context we have to study java operators to know more
//the operations happens minimum on integers
long total = b + s;
System.out.println(total);

int x = 10;
long y = 20;
total = x + y;//widening context
System.out.println(total);
/*
byte b = 10;
int i = 1927;
System.out.println(b);
i = b;
System.out.println(i);

byte b1 = 10;
byte b2 = 10;
byte b3 = 10;
final int i = 10;//Final is compile time constant
final int j = 127;
final int k = 190;
b1 = i;
System.out.println(b1);
b2 = j;
System.out.println(b2);
//b3 = k;//checks weather narrowing or widening(in java narrowing is not allowed)
//System.out.println(b3);

{byte,char,short,int,long,float,double,boolean}-> boolean is odd
{byte,char,short,int,long,float,double}-> char is odd because char is unsigned
{byte,short,int,long} -> float,double is odd because of floating points
{byte,short,int,long} ->

//Local variables don't have deault value
//They have to be initalized before using them
//otherwise th program does not compile
//int total=true;//Incompatible types error willbe poped
//int determines what type it is,value length to store,sign()
int total=1099999935;
System.out.println(total);
//1.A program can be created or done using only literals(Literal)
//If we are not using data type and  then we call it as literal
//Literal become part of the source code.So No memory is requied from literals
//The progams with literals will run faster

System.out.println(10);//integer literal
System.out.println(710.8789);//double literal
System.out.println(false);//boolean literal
System.out.println('a');//char literal
System.out.println("Sharath");//String literal
System.out.println((String) null);//null literal

//Reusing and modifications can lead to bugs
//Maintanence gets slower
System.out.println(108765+108765432);
System.out.println(10432+176543);
*/
}
}