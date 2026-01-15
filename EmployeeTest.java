import java.util.Scanner;
class Employee
{
String first_name;
String last_name;
int id;
float month_sal;
Employee()
{
first_name="";
last_name="";
id=0;
month_sal=0.0f;
}
Employee(String f,String l,int i,float s)
{
first_name=f;
last_name=l;
id=i;
month_sal=s;
}
void setfirstname(String f){
first_name=f;
}
void setlastname(String l){
last_name=l;
}
void setid(int i){
id=i;
}
void setmonthsal(float s){
if(s<=0){
month_sal=0.0f;
}
else{
month_sal=

}

String getfirstname(){
return first_name;
}
String getlastname(){
return last_name;
}
int getid(){
return id;
}
float getmonthsal(){
return month_sal;
}

}
class EmployeeTest
{
public static void main(String args[])
{
Employee e1=new Employee("SURAJ","MANE",2163,30000);
System.out.println("Employee first name : "+e1.getfirstname());
System.out.println("Employee last name : "+e1.getlastname());
System.out.println("Employee ID : "+e1.getid());
System.out.println("Employee monthly salary : "+e1.getmonthsal());

Employee e2=new Employee("SHANTANU","PATIL",2164,40000);
System.out.println("Employee first name : "+e2.getfirstname());
System.out.println("Employee last name : "+e2.getlastname());
System.out.println("Employee ID : "+e2.getid());
System.out.println("Employee monthly salary : "+e2.getmonthsal());

}
}