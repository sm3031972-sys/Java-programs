import java.util.Scanner;
class shortstring
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=new String();
System.out.println("Enter String : ");
str=sc.nextLine();
int i,j;
char c,d;
i=str.length()-1;
while(str.charAt(i)==' ')
i--;
j=0;
while(j<i)
{
if(j==0)
System.out.println(str.charAt(j)+".");
else
{
c=str.charAt(j);
d=str.charAt(j+1);
if(c==' '&&d!=' ')
  System.out.println(str.charAt(d)+".");
}
j++;
}
System.out.println(str.substring(i));
}
}