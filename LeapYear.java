import java.util.Scanner;
class LeapYear{
    public static void main(String args[])
    {
        // approach 1

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Year :: ");
        int year=sc.nextInt();

        if(year % 4==0){
            if(year%100==0){
              if(year%400==0){
               System.out.println("This is  a Leap Year !!");
              }else{
              System.out.println("This is not a Leap Year !!");

              }
            }else{
            System.out.println("This is  a Leap Year !!");
            }

        }else{
            System.out.println("This is not a Leap Year !!");
        }

        // Approach 2

        boolean isLeapYear=(year%4)==0 ?(year%100)==0 ? (year%400)==0 ?true:false:true :false;

        if(isLeapYear){
        System.out.println("This is  a Leap Year !!");
        }else{
        System.out.println("This is not a Leap Year !!");

        }
    }
}