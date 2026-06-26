class prime1to100
{
public static void main(String args[])
{
int i,count,j;
for(i=1;i<=100;i++)
{
count=0;
for(j=0;j<=1;j++)
{
if(j%i==0)
  count=count+1;
}
if(count==2)
 System.out.println(i);
}
}
}
