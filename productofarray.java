import java.util.Scanner;
class productofarray
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int size,pro=1;
System.out.println("enter size of array : ");
size=sc.nextInt();
int a[]=new int[size];
System.out.println("enter array elements : ");
for(int i=0;i<size;i++)
{
 a[i]=sc.nextInt();
}
for(int i=0;i<size;i++)
{
pro=pro*a[i];
}
System.out.println("product of all elements of array are : "+pro);
}
}
