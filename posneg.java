import java.util.Scanner;
class posneg
{
public static void main(String args[])
{
int a;
Scanner sc=new Scanner(System.in);
System.out.println("enter any number");
a=sc.nextInt();
if(a>0)
System.out.println("positive");
else if(a<0)
System.out.println("negative");
else
System.out.println("number is zero");
}
}
