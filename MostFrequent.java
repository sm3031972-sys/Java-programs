
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Integer;

class MostFrequent{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size oF a ArrayList : ");
        int n=sc.nextInt();
        System.out.println("Enter The Key : ");
        int key=sc.nextInt();

        System.out.println("Enter Arraylist :");

        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            arr.add(num);
        }
        
        int count[]=new int[1001];

        for(int i=1;i<arr.size();i++){
            if(arr.get(i-1)==key){
                count[arr.get(i)]++;
            }
        }

        int max_index=0;
        for(int i=0;i<count.length;i++){
            if(count[i]>count[max_index]){
                max_index=i;
            }
        }
        
        System.out.println("Maximum value of a index which is occured by key value is : "+max_index);
    }
}