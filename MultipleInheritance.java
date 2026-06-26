class student
{
int roll;
void getroll(int n)
{
roll=n;
}
void putroll()
{
System.out.println("roll = "+roll);
}
}
class test extends student
{
float mark1,mark2;
void getmark(float m1,float m2)
{
mark1=m1;
mark2=m2;
}
void putmark()
{
System.out.println("marks1="+mark1+"\nmarks2="+mark2);
}
}
interface sports
{
float sportmark=6.4f;
void putsport();
}
class Result extends test implements sports
{
float total;
public void putsport()
{
System.out.println("sports marks = "+sportmark);
}
void display()
{
total=mark1+mark2+sportmark;
putroll();
putmark();
putsport();
System.out.println("total marks = "+total);
}
}
class MultipleInheritance
{
public static void main(String args[])
{
Result aa=new Result();
aa.getroll(2103);
aa.getmark(89.4f,92.7f);
aa.display();
}
}

