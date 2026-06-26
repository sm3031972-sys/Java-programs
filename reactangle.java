import java.util.Scanner;
class reactangle
{
public static void main(String args[])
{
int len,ber,area;
Scanner sc=new Scanner(System.in);
System.out.println("enter length of a reactangle");
len=sc.nextInt();
System.out.println("enter breadth of a reactangle");
ber=sc.nextInt();
area=len*ber;
System.out.println("area of a reactangle is : "+area);
}
}
