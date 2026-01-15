import java.util.Scanner;
class addd2
{
int a,b;
addd2(int x,int y)
{
a=x;
b=y;
}
void display()
{
System.out.println("a="+a);
System.out.println("b="+b);
}
void method()
{
int c;
c=a+b;
System.out.println("addition : "+c);
}
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
int m,n;
System.out.println("enter first number ");
m=sc.nextInt();
System.out.println("enter second number ");
n=sc.nextInt();

addd2 aa=new addd2(m,n);
aa.display();
aa.method();
}
}

