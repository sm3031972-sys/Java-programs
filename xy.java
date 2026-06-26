import java.util.Scanner;
class xy
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int arr[]=new int[5];
System.out.println("enter array elements : ");
for(int i=0;i<5;i++)
{
arr[i]=sc.nextInt();
}
System.out.println("ARRAY ELEMENST  : ");
for(int i=0;i<5;i++)
System.out.println(arr[i]);
}
}