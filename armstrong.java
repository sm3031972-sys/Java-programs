import java.util.Scanner;
class armstrong
{
public static void main(String args[])
{
int n,z,digit,pro,sum=0,count=0,i;
Scanner sc=new Scanner(System.in);
System.out.println("enter number to check digits");
n=sc.nextInt();
z=n;
while(z>0)
{
count=count+1;
z=z/10;
}
z=n;
while(z>0)
{
pro=1;
digit=z%10;
for(i=1;i<=count;i++)
   pro=pro*digit;
sum=sum+pro;
z=z/10;
}
if(sum==n)
  System.out.println("the given number is armstrong number");
else
  System.out.println("the given number is not armstrong number");
}
}


