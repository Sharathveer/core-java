class Writingmethods{

//functions/subroutines/procedures/methods/messages have
/*
1.every method has an identifier.
2.should have a return type atleast void.
3.name is followed by parameter list()-which can be empty.
4.has a body{}
5.based on (2) above the method ends with return statement.
6.methods can be instance/static
*/
void print(){
System.out.println("Hello World");
return;
}
void printStars(int n){
for (int i=1;i<=n;i++);
System.out.println("*");
return;
}
void printSeries(int from,int to){
for (int i = from;i<= to;i++){
System.out.println(i);

}
return;


}
int product(int x,int y){
return x*y;



}

}