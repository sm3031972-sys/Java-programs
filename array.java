import java.util.Scanner;
class array
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a[]=new int[5];
System.out.println("enter array elements : ");
for(int i=0;i<5;i++)
{
 a[i]=sc.nextInt();
}
System.out.println("array elements are :");
for(int i=0;i<5;i++)
{
 System.out.println(a[i]);
}
}
}
    