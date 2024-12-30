import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Files;
public class Filehandling3
{
    public static void main(String[] args) {
        String fileName ="example3.txt";
        try{
            Files.write(Paths.get(fileName),"Myself Kavya KT,I have completed MCA and Currently i am learing Java Course in Tata Strive".getBytes());
            System.out.println("File Created Succesfully");
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
