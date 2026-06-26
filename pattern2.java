import java.util.Scanner;
class pattern2
{
public static void main(String args[])
{
int n,j;
Scanner sc=new Scanner(System.in);
System.out.println("enter nuber of rows in pattern ");
n=sc.nextInt();
for(;n>=1;n--)
{
  for(j=1;j<=n;j++)
      System.out.print("*");
System.out.println();
}
}
}