import java.util.Scanner;
class prime
{
int n;
void getdata()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number to check : ");
n=sc.nextInt();
}
void putdata()
{
int count=0,i;
for(i=1;i<=n;i++)
{
if(n%i==0)
  count=count+1;
}
if(count==2)
  System.out.println("this no. is a prime number  ");
else
   System.out.println("this no. is a not prime number  ");
}
}
class demoprime
{
public static void main(String args[])
{
prime aa=new prime();
aa.getdata();
aa.putdata();
}
}
  
  