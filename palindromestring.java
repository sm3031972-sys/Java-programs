import java.util.Scanner;
class palindromestring
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=new String();
System.out.println("Enter string : ");
str=sc.nextLine();
int i,j,flag;
i=0;
flag=0;
j=str.length()-1;
while(i<j&&flag==0)
{
if(str.charAt(i)!=str.charAt(j))
flag=1;
i=i+1;
j=j-1;
}
if(flag==0)
System.out.println("THE GIVEN STRING IS A PALINDROME ");
else
System.out.println("THE GIVEN STRING IS NOT  PALINDROME ");
}
}