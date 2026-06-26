class a
{
final void message()
{
System.out.println("this is base class");
}
}
class b extends a
{
void message()
{
System.out.println("this is derrived class ");
}
}
class override
{
public static void main(String args[])
{
b aa=new b();
aa.message();
}
}
