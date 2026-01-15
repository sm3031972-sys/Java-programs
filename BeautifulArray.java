import java.util.Scanner;
import java.util.ArrayList;
class BeautifulArray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of arrayList :");
        int n=sc.nextInt();
       

        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(1);

        while(ans.size()<n){
            ArrayList<Integer> temp=new ArrayList<>();
            int ans_size=ans.size();

            for(int i=0;i<ans_size;i++){
                if(ans.get(i)*2-1 <= n){
                    temp.add(ans.get(i)*2-1);
                }
            }

            for(int i=0;i<ans_size;i++){
                if(ans.get(i)*2 <= n){
                    temp.add(ans.get(i)*2);
                }
            }
            ans=temp;
        }
        System.out.println("Beautiful Array is : ");
    
            System.out.print(ans);
        
    }
} 