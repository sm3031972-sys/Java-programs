class function
{
int add(int a,int b)
{
return a+b;
}
int add(int a,int b,int c)
{
return a+b+c;
}
double add(double a,double b)
{
return a+b;
}
}
class overloading
{
public static void main(String args[])
{
function aa=new function();
System.out.println("addtion :"+aa.add(3,4));
System.out.println("addtion :"+aa.add(3,4,5));
System.out.println("addtion :"+aa.add(3.5,4.5));
}
}