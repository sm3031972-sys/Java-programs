import java.util.Scanner;
class productofdigits
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,pro=1;
System.out.println("enter any number : ");
n=sc.nextInt();
while(n>0)
{
pro=pro*(n%10);
n=n/10;
}
System.out.println("product of given digits is : "+pro);
}
}

