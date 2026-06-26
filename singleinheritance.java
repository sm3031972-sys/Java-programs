import java.util.Scanner;
class A
{
int a,b;
void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter first number : ");
a=sc.nextInt();
System.out.println("enter second number : ");
b=sc.nextInt();
}
void add()
{
System.out.println("addition of two numbers is : "+(a+b));
}
}
class B extends A
{
int c;
void getdata()
{

Scanner sc=new Scanner(System.in);
System.out.println("enter third  number : ");
c=sc.nextInt();
}
void display()
{
System.out.println("addition of three numbers is : "+(a+b+c));
}
}
class singleinheritance
{
public static void main(String args[])
{
B aa=new B();
aa.input();
aa.getdata();
aa.add();
aa.display();
}
}

