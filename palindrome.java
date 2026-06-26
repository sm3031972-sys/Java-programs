import java.util.Scanner;
class palindrome
{
public static void main(String args[])
{
int n,z,rev=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter any number to check");
n=sc.nextInt();
z=n;
while(n>0)
{
rev=(rev*10)+(n%10);
n=n/10;
}
if(rev==z)
    System.out.println("the number is palindrome");
else
    System.out.println("the number is not palindrome");
}
}
