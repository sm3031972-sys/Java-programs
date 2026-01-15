import java.util.Scanner;
class a
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
}
class b extends a
{
void add()
{
System.out.println("additon : "+(a+b));
}
}
class c extends b
{
void sub()
{
System.out.println("substraction : "+(a-b));
}
}
class herarchical
{
public static void main(String args[])
{
c aa=new c();
aa.input();
aa.add();
aa.sub();
}
}