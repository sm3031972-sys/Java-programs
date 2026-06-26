import java.util.Scanner;
class person
{
int id;
String name;
person()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter id of a person : ");
id=sc.nextInt();
System.out.println("enter name of a person :");
name=sc.nextLine();
}
void show()
{
System.out.println("persons id : "+id);
System.out.println("persons name : "+name);
}
}
class student extends person
{
int fees;
student()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter fees : ");
fees=sc.nextInt();
}
void show()
{
super.show();
System.out.println("fees : "+fees);
}
}
class teacher extends person
{
int sal;
teacher()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter salary : ");
sal=sc.nextInt();
}
void show()
{
super.show();
System.out.println("salray : "+sal);
}
}

class xyzw
{
public static void main(String args[])
{
student aa=new student();
aa.show();
teacher bb=new teacher();
bb.show();
}
}

