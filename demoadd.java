import java.util.Scanner;
class demoadd
{
int a,b;
void getdata()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter two numbers : ");
a=sc.nextInt();
b=sc.nextInt();
}
void putdata()
{
System.out.println("addition : "+(a+b));

}
public static void main(String args[])
{
demoadd aa=new demoadd();
aa.getdata();
aa.putdata();
}
}