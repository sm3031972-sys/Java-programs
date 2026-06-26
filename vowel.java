import java.util.Scanner;
class vowel
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=new String();
int i,vow=0,cons=0;
System.out.println("Enter a string : ");
str=sc.nextLine();
str=str.toUpperCase();
for(i=0;i<str.length();i++)
{
 char c=str.charAt(i);
 if(c!=' ')
{
 if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
  vow=vow+1;
 else
  cons=cons+1;
}
}
System.out.println("total vowels : "+vow+"\n"+"Total consonants : "+cons);
}
}