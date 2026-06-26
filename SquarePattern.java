import java.util.Scanner;
class SquarePattern{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int rows=1;
        int stars=n;
        int spaces=n-2;

        while(rows<=n-1){
            if(rows==1 || rows==n-1){
                for(int i=0;i<stars;i++){
                    System.out.print("* ");
                }
            }else{
                // print *
                  System.out.print("* ");
                // print spaces
                  for(int i=0;i<n-2;i++){
                    System.out.print("  ");
                  }
                // print *
                  System.out.print("* ");
            }
            System.out.println();
            rows++;
        }
    }
}