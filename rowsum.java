import java.util.Scanner;
class demo
{
int a[][]=new int[3][3];
int i,j;
void getdata()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter elements : ");
for(i=0;i<3;i++)
for(j=0;j<3;j++)
{
a[i][j]=sc.nextInt();
}
}
void rowsum()
{
int sum=0;
for(i=0;i<3;i++)
{
sum=0;
for(j=0;j<3;j++)
{
sum=sum+a[i][j];
}
System.out.println("sum of "+(i+1)+"row is "+sum);
}
}
}
class rowsum
{
public static void main(String args[])
{
demo aa=new demo();
aa.getdata();
aa.rowsum();
}
}