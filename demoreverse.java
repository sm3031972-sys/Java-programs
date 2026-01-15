import java.util.Scanner;
class reverse
{
int n;
void getdata()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter number to reverse : ");
n=sc.nextInt();
}
void putdata()
{
int rev=0;
while(n>0)
{
rev=(rev*10)+n%10;
n=n/10;
}
System.out.println("reverse of number is : "+rev);
}
}
class demoreverse
{
public static void main(String args[])
{
reverse aa=new reverse();
aa.getdata();
aa.putdata();
}
}
