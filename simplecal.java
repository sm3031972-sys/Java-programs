import java.util.Scanner;
class simplecal
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,ch;
System.out.println("enter first number");
a=sc.nextInt();
System.out.println("enter second number");
b=sc.nextInt();
System.out.println("1->add 2->subtract 3->multiply 4->div enter your choice");
ch=sc.nextInt();
if(ch==1)
System.out.println("addtion :"+(a+b));
else if(ch==2)
System.out.println("substraction :"+(a-b));
else if(ch==3)
System.out.println("multiplication :"+(a*b));
else if(ch==4)
System.out.println("division :"+(a/b));
else
System.out.println("invalid choice!!");

}
}