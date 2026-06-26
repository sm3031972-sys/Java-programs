import java.util.Scanner;
class sumofdigits
{
public Static void main(String args[])

{
Scanner sc=new Scanner(System.in);
int sum,n;
System.out.println("enter any number");
n=sc.nextInt();
while(n>0)
{
sum=sum+(n%10);
n=n/10;
}
System.out.println("sum digits of number is: "+sum);
}
}