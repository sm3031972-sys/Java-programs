import java.util.Scanner;
class demo
{
int a[]=new int[10];
void getdata()
{
Scanner sc=new Scanner(System.in);
for(int i=0;i<10;i++)
{
System.out.println("enter elements : ");
a[i]=sc.nextInt();
}
}
void putdata()
{
for(int i=0;i<10;i++)
{
System.out.print(a[i]+"  ");
}
}
void sort()
{
int i,j,t;
for(i=0;i<10;i++)
for(j=i+1;j<10;j++)
{
if(a[i]>a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
}
class selection
{
public static void main(String args[])
{
demo aa=new demo();
aa.getdata();
System.out.println("\nunsorted array !!");
aa.putdata();
aa.sort();
System.out.println("sorted array !!");
aa.putdata();
}
}


