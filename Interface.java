Interface area
{
float pi=3.14f;
void calculate(float x,float y);
}
class Reactangle implements area
{
void calculate(float x,float y)
{
return x*y;
}
}
class Circle implements area
{
void calculate(float x,float y)
{
return pi*x*x;
}
}
class Interface1
{
public static void main(String args[])
{
Reactangle rect=new Reactangle();
Circle c=new Circle();
area a;
a=rect;
System.out.println("area of reactangle : "+a.calculate(10,20));
a=c;
System.out.println("area of circle : "+a.calculate(10,0));
}
}

 