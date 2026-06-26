import java.util.Scanner;
class noofdigits
{
public static void main(String args[])
{
int n,count=0,i;
Scanner sc=new Scanner(System.in);
System.out.println("enter number to check digits");
n=sc.nextInt();
while(n>0)
{
count=count+1;
n=n/10;
}
System.out.println("number of digits : "+count);
}
}

