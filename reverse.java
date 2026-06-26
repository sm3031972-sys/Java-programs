import java.util.Scanner;
class reverse
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,rev=0;
System.out.println("enter number to reverse");
n=sc.nextInt();
while(n>0)
{
rev=(rev*10)+(n%10);
n=n/10;
}
System.out.println("reverse og number is : "+rev);
}
}


