import java.util.Scanner;
class switchcase
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
switch(ch)
{
 case 1:
      System.out.println("addtion : "+(a+b));
      break;
case 2:
      System.out.println("substraction : "+(a-b));
      break;
case 3:
      System.out.println("multiply : "+(a*b));
      break;
case 4:
      System.out.println("division : "+(a/b));
      break;
default:
        System.out.println("invalid choice");
}

}
}