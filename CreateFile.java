import java.io.*;
class CreateFile{
    public static void main(String args[])
    {
        try{
            File file=new File("example.txt");
            if(file.createNewFile()){
                System.out.println("File Created : "+file.getName());
            }
            else{
                System.out.println("File is already created!!");
            }

        }
        catch(IOException e){
              System.out.println("An Error Occurred.");
        }
    }
}