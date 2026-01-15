import java.util.Scanner;
class fibonacii
{
public static void main(String args[])
{
int x=0,y=1,z=0,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter max value : ");
n=sc.nextInt();
while(z<=n)
{
System.out.println(z);
x=y;
y=z;
z=x+y;
}
}
}