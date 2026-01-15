import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class LonelyNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of arrayList :");
        int n=sc.nextInt();
        System.out.println("Enter A ArrayList : ");
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            arr.add(num);
        }

        ArrayList<Integer> result=new ArrayList<>();
        int m=arr.size();

        Collections.sort(arr);

        for(int i=0;i<m;i++){

            if(i!=0 && (arr.get(i-1)==arr.get(i)-1 || arr.get(i-1)==arr.get(i))){
                continue;
            }

            if(i!=n-1 && (arr.get(i+1)==arr.get(i)+1 || arr.get(i+1)==arr.get(i))){
                continue;
            }
            result.add(arr.get(i));
        }
        int ans_size=result.size();

        System.out.println("Lonely Numbers Are : ");
        for(int i=0;i<ans_size;i++){
            
            System.out.println(result.get(i)+" ");
        }
    }
}