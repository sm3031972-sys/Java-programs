import java.util.Scanner;
class a
{
int a;
void input()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter first number :");
a=sc.nextInt();
}
}
class b extends a
{
int b;
void getdata()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter second number : ");
b=sc.nextInt();
}
}
class c extends b
{
void add()
{
System.out.println("addition : "+(a+b));
}
}
class multilevel 
{
public static void main(String args[])
{
c aa=new c();
aa.input();
aa.getdata();
aa.add();
}
}