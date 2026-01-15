import java.util.Scanner;
class equal
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str1=new String();
String str2=new String();
System.out.println("ENter first string : ");
str1=sc.nextLine();
System.out.println("Enter second string : ");
str2=sc.nextLine();
if(str1.equals(str2))
System.out.println("given string is equal ");
else
System.out.println("given string is not equal ");
if(str1.equalsIgnoreCase(str2))
System.out.println("given string is equal ");
else
System.out.println("given string is not equal ");
}
}