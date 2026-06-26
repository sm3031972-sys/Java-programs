class SavingAccount
{
static float annualInterestRate=4.0f;
private int accountID;
private String holderName;
private int savingBalance;
SavingAccount()
{
accountID=0;
holderName="";
savingBalance=0;
}
SavingAccount(int i,String s,int j)
{
accountID=i;
holderName=s;
savingBalance=j;
}
void setaccount_id(int i)
{
accountID=i;
}
void setholder_Name(String s)
{
holderName=s;
}
void setsaving_Balance(int j)
{
savingBalance=j;
}

int getaccount_id()
{
return accountID;
}
String getholder_Name()
{
return holderName;
}
int getsaving_Balance()
{
return savingBalance;
}

float monthly_interest;
void monthlyinterest()
{
monthly_interest=(savingBalance*annualInterestRate)/100;
System.out.println("Monthly Interest : "+monthly_interest);
}

float yearly_interest;
void yearlyinterest()
{
yearly_interest=((savingBalance*annualInterestRate)/100)*12;
System.out.println("Yearly Interest : "+yearly_interest);
}

void updatedannualInterestRate(float newannualInterestRate)
{
annualInterestRate=newannualInterestRate;
}
}
class SavingAccountMain
{
public static void main(String args[])
{
SavingAccount s1=new SavingAccount(1,"Suraj Mane",30000);

System.out.println("Detail of first Account ");
System.out.println("Account ID : "+s1.getaccount_id());
System.out.println("Account Holder Name  : "+s1.getholder_Name());
System.out.println("Account Balance  : "+s1.getsaving_Balance());
System.out.println("monthly & yearly interest before updating annual interest : ");
s1.monthlyinterest();
s1.yearlyinterest();
System.out.println("monthly & yarly interest after updating annual interest : ");
s1.updatedannualInterestRate(5.0f);
s1.monthlyinterest();
s1.yearlyinterest();
System.out.println("!!------------------------------------!!");
System.out.println("Detail of second Account ");
SavingAccount s2=new SavingAccount(2,"Shantanu Patil",40000);
System.out.println("Account ID : "+s2.getaccount_id());
System.out.println("Account Holder Name  : "+s2.getholder_Name());
System.out.println("Account Balance  : "+s2.getsaving_Balance());
System.out.println("monthly and yearly interest before updating annual interest : ");
s2.monthlyinterest();
s2.yearlyinterest();
System.out.println("monthly and yearly interest after updating annual interest : ");
s2.updatedannualInterestRate(5.0f);
s2.monthlyinterest();
s2.yearlyinterest();
}
}






