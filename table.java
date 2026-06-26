import java.util.Scanner;
class table
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,j;
System.out.print("enter number to give table ");
i=sc.nextInt();
j=1;
while(j<=10)
{
System.out.println(i*j);
j=j+1;
}
}
}

