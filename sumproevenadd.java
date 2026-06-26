import java.util.Scanner;
class sumproevenadd
{
public static void main(String args[])

{
int n,sum=0,pro=1,digit;
Scanner sc=new Scanner(System.in);
System.out.println("enter any number to perform opertaion");
n=sc.nextInt();
while(n>0)
{
digit=n%10;
if(digit%2==0)
    sum=sum+digit;
else
   pro=pro*digit;
n=n/10;
}
System.out.println("sum of digits : "+sum);
System.out.println("product of digits : "+pro);
}
}

