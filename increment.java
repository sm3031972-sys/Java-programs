class student
{
static int idcount=1000;
int id;
String name;
student(String name)
{
this.name=name;
this.id=++idcount;
}
void display()
{
System.out.println("ID : "+id);
System.out.println("name :"+name);

}
}
class increment
{
public static void main(String args[])
{
student s1=new student("suraj");
s1.display();
student s2=new student("shantanu");
s2.display();
student s3=new student("samarth");
s3.display();



}
}
