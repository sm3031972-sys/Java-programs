import java.util.Scanner;
class maxmin
{
public static void main(String args[])
{
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("enter first number");
a=sc.nextInt();
System.out.println("enter second number");
b=sc.nextInt();
if(a>b)
System.out.println("a is maximum");
else
System.out.println("b is maximum");
}
}