import java.util.Scanner;
class demo
{
int a[][]=new int[3][3];
int b[][]=new int[3][3];
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
void putdata()
{
System.out.println("Matrix is  : ");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(a[i][j]+"   ");
}
System.out.println();
}
}
void transpose()
{
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
b[i][j]=a[j][i];
}
}
System.out.println("transpose of MAtrix is : ");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(b[i][j]+"   ");
}
System.out.println();
}
}
}
class transpose
{
public static void main(String args[])
{
demo aa=new demo();
aa.getdata();
aa.putdata();
aa.transpose();
}
}