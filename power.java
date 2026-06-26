import java.util.Scanner;
class power
{
public static void main(String args[])
{
int x,y,pro=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter any  number ");
x=sc.nextInt();
System.out.println("enter power of y ");
y=sc.nextInt();
while(y>0)
{
pro=pro*x;
y=y-1;
}
System.out.println("value : "+pro);
}
}
 