import java.util.Scanner;
class demo
{
int a[]=new int[10];
int key;
void getdata()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter array elements : ");
for(int i=0;i<10;i++)
{
a[i]=sc.nextInt();
}
System.out.println("enter number to search into the given array of numbers : ");
key=sc.nextInt();
}
int pos;
void search()
{
int i,flag=0;

for(i=0;i<10&&flag==0;i++)
{
if(a[i]==key)
 {
  flag=1;
  pos=i+1;
 }
}
if(flag==1)
  System.out.println("this is found at position "+pos);
else
  System.out.println("number is not found ");
}
}
class linear
{
public static void main(String args[])
{
 demo aa=new demo();
 aa.getdata();
aa.search();
}
}