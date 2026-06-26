import java.util.Scanner;
class oddeven
{
public static void main(String args[])
{
int a;
Scanner sc=new Scanner(System.in);
System.out.println("enter any number to check");
a=sc.nextInt();
if(a%2==0)
System.out.println("even");
else
System.out.println("odd");
}
}