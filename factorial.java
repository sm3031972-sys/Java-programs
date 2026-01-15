import java.util.Scanner;
class factorial
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,n,fac=1;
System.out.println("enter number to obtain facttorial ");
n=sc.nextInt();
i=1;
while(i<=n)
{
fac=fac*i;
i=i+1;
}
System.out.println("factorial of given number is : "+fac);
}
}