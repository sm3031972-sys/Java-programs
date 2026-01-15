class A
{
void input()
{
System.out.println("this is parent class ");
}
}
class B extends A
{
@Override
void input()
{
super.input();
System.out.println("this is child class : ");
}

}
class demo2
{
public static void main(String args[])
{
B aa=new B();
aa.input();
}
}