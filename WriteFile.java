import java.io.*;
import java.util.Scanner;
class WriteFile{
    public static void main(String agrs[]){
        Scanner sc=new Scanner(System.in);
        try{
            FileWriter writer=new FileWriter("example.txt");
            System.out.println("ENter content want to add in the file");
            String content=sc.nextLine();
            writer.write(content);
            writer.close();
        }
        catch(IOException e)
        {
            System.out.println("Exception Occurred!!");
        }
    }
}