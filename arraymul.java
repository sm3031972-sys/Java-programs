import java.util.Scanner;
class arraymul
{
public static void main(String args[])
{
int a[][]=new int[3][3];
int b[][]=new int[3][3];
int c[][]=new int[3][3];
int i,j,k;
Scanner sc=new Scanner(System.in);
System.out.println("enter first array element : ");
for(i=0;i<3;i++)
for(j=0;j<3;j++)
{
a[i][j]=sc.nextInt();
}
System.out.println("enter second array element : ");
for(i=0;i<3;i++)
for(j=0;j<3;j++)
{
b[i][j]=sc.nextInt();
}
for(i=0;i<3;i++)
for(j=0;j<3;j++)
{
c[i][j]=0;
for(k=0;k<3;k++)
{
c[i][j]+=a[i][k]*b[k][j];
}
}
System.out.println("Multiplication of two matrix is : ");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(c[i][j]+"   ");
}
System.out.println();
}
}
}



