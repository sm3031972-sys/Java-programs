import java.util.Scanner;
class reverse
{
int n;
reverse(int i)
{
n=i;
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
class demoreverse2
{
public static void main(String args[])
{
reverse aa=new reverse(123);
aa.putdata();
}
}
