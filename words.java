import java.util.Scanner;
class words
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=new String();
int i,count=1,len;
System.out.println("Enter a String to check words in it : ");
str=sc.nextLine();
len=str.length();
for(i=0;i<len;i++)
{
char c,d;
c=str.charAt(i);
d=str.charAt(i+1);
if(c==' '&&d !=' ')
 count=count+1;
}
System.out.println("Total number of words : "+count);
}
}