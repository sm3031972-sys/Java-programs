import java.util.Scanner;
class AnagramsSecondMethod{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();

        int f1[]=new int[128];
        int f2[]=new int[128];

        if(s1.length()!=s2.length()){
            System.out.println("NOT a anagrams !!");
            return;
        }

        for(int i=0;i<s1.length();i++){
            f1[s1.charAt(i)]++;
        }

        for(int i=0;i<s2.length();i++){
            f2[s2.charAt(i)]++;
        }

        int flag=0;
        for(int i=0;i<128;i++){
            if(f1[i]!=f2[i]){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("This is aanagram!!");
        }
        else{
            System.out.println("Not A Anagram !!");
        }
    }
}