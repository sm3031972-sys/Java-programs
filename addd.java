class addd
{
int a,b;
addd()
{
a=0;
b=0;
}
addd(int x,int y)
{
a=x;
b=y;
}
void display()
{
System.out.println("a ="+a+"b ="+b);
}
void method()
{
int c;
c=a+b;
System.out.println("addition : "+c);
}
public static void main(String args[])
{
addd aa=new addd();
aa.display();
aa.method();
 
addd bb=new addd(5,55);
bb.display();
bb.method();
}
}