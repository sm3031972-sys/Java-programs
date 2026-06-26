import java.util.Scanner;
class String1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=new String();
int len,i;
System.out.println("Enter a String : ");
str=sc.nextLine();
len=str.length();
System.out.println("the strring is : "+str);
System.out.println("Length of string is : "+len);
for(i=0;i<len;i++)
  System.out.println(str.charAt(i));
str=str.toUpperCase();
System.out.println(str);
System.out.println(str.toLowerCase());
System.out.println(str);
}
}
