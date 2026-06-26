import java.util.Scanner;
class pattern3
{
public static void main(String args[])
{
int i,n,b,j;
Scanner sc=new Scanner(System.in);
System.out.println("enter number of rows :");
n=sc.nextInt();
for(i=1;i<=n;i++)
{for(b=1;b<=n-i;b++)
   System.out.print(" ");
 for(j=1;j<=i;j++)
   System.out.print("*");
System.out.println();
}
}
}