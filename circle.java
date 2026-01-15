import java.util.Scanner;
class circle
{
int r,ar;
void getdata()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter radius of a circle : ");
r=sc.nextInt();

}
void area()
{
ar=3*r*r;
System.out.println("area of a circle is : "+ar);
}
public static void main(String args[])
{
circle cc=new circle();
cc.getdata();
cc.area();
}
}