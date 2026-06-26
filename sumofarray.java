import java.util.Scanner;
class sumofarray
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int size,sum=0;
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
sum=sum+a[i];
}
System.out.println("sum of all elements of array are : "+sum);
}
}
