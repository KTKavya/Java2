import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Filehandling6 {
    public static void main(String[] args) {
        String fileName="example7.txt";
        String content="welcome to class";
        try{
            Files.write(Paths.get(fileName),content.getBytes());
            System.out.println("File written succesfully");
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
