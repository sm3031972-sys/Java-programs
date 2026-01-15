import java.util.Scanner;
class demo
{
int a[]=new int[10];
void getdata()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter array elements : ");
for(int i=0;i<10;i++)
{
a[i]=sc.nextInt();
}
}
void putdata()
{
for(int i=0;i<10;i++)
{
System.out.print(a[i]+"  ");
}
System.out.println();
}
void sort()
{
int i,j,t;
for(i=0;i<10;i++)
for(j=0;j<9-i;j++)
{
if(a[j]>a[j+1])
{
t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
}
}
}
class bubble
{
public static void main(String args[])
{
demo aa=new demo();
aa.getdata();
System.out.println("unsorted array !!");
aa.putdata();
aa.sort();
System.out.println("sorted array !!");
aa.putdata();
}
}