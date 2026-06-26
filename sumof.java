import java.util.Scanner;
class sumof
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,n,add=0;
System.out.println("enter number up to which sum operation is performed");
n=sc.nextInt();
i=1;
while(i<=n)
{
add=add+i;
i=i+1;
}
System.out.println("sum of numbers is : "+add);
}
}
