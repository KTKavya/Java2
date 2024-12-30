import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Filehandling4
{
    public static void main(String[] args) throws IOException {
        String fileName="example4";
        File file =new File(fileName);
        try{
            if(file.createNewFile()){
                System.out.println("File Created Succesfully");
            }
            else{
                System.out.println("File already exist");
            }
            FileWriter writer=new FileWriter(file);
            writer.write("welcome to Tata strive\n");
            writer.write("Good Morning");
            System.out.println("Content written to the file succesfully");
            writer.close();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
