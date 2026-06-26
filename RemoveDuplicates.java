import java.util.Scanner;
class RemoveDuplicates
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a string ");
String input=sc.nextLine();

String output="" +input.charAt(0);
for(int i=1;i<input.length();i++)
{
if(input.charAt(i)!=input.charAt(i-1))
{
output+=input.charAt(i);
}
}
System.out.println("MAIN STRING IS : "+output);
}
}