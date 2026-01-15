import java.util.Scanner;
class Employee
{
String first_name;
String last_name;
int id;
float basic_sal;

Employee(){
first_name="";
last_name="";
id=0;
basic_sal=0.0f;
}
Employee(String f,String l,int i,float s){
first_name=f;
last_name=l;
id=i;
basic_sal=s;
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
void setbasicsal(float s){
if(basic_sal<=0){
basic_sal=8000;
}
else{
basic_sal=s;
}
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
float getbasicsal(){
return basic_sal;
}

void salhike()
{
basic_sal=basic_sal+basic_sal*0.10f;
System.out.println("Salary hike : "+basic_sal);
}
float grossmonthly_sal;
float grossyearly_sal;
void yearlysal()
{
float DA=0.0f;
float HRA=0.0f;
int TA=0;
int PF=0;
int PT=0;

if(basic_sal!=8000 || basic_sal!=8800)
{
DA=basic_sal*0.15f;
HRA=basic_sal*0.18f;
TA=2000;
PF=1200;
PT=200;
grossmonthly_sal=(basic_sal+DA+HRA+TA)-(PF+PT);
System.out.println("Monthly Salary : "+grossmonthly_sal);
grossyearly_sal=grossmonthly_sal*12;
System.out.println("Yearly Salary : "+grossyearly_sal);
}
else
{
grossmonthly_sal=basic_sal;
System.out.println("Monthly Salary : "+grossmonthly_sal);
grossyearly_sal=grossmonthly_sal*12;
System.out.println("Yearly Salary : "+grossyearly_sal);
}
}
}
class Exp1
{
public static void main(String args[])
{
System.out.println("first employee details !!");
System.out.println("----------------------------------");
Employee e1=new Employee("SURAJ","MANE",2163,40000);
System.out.println("first name : "+e1.getfirstname());
System.out.println("last name : "+e1.getlastname());
System.out.println("ID : "+e1.getid());
System.out.println("Salary : "+e1.getbasicsal());
e1.salhike();
e1.yearlysal();
System.out.println("----------------------------------");
System.out.println("second employee details !!");
Employee e2=new Employee("Shantanu","Patil",2163,40000);
System.out.println("first name : "+e2.getfirstname());
System.out.println("last name : "+e2.getlastname());
System.out.println("ID : "+e2.getid());
System.out.println("Salary : "+e2.getbasicsal());
e1.salhike();
e1.yearlysal();
System.out.println("----------------------------------");
}
}
