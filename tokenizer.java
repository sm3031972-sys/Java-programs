import java.util.StringTokenizer;
class tokenizer
{
public static void main(String args[])
{
String text="this a java progrraming ";
StringTokenizer st=new StringTokenizer(text);
while(st.hasMoreTokens())
{
System.out.println(st.nextToken());
}
}
}
