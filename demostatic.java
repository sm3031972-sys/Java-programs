class staticstudent
{
int roll;
String name;
String cname="DYP College";
staticstudent(int x,String y)
{
roll=x;
name=y;
}
void display()
{
System.out.println("roll no : "+ roll);
System.out.println("name of student : " + name);
System.out.println("college name : " + cname);
}
}
class demostatic
{
public static void main(String args[])
{
staticstudent aa=new staticstudent(101,"suraj");
staticstudent bb=new staticstudent(102,"shantanu");
aa.display();
bb.display();
}
}


