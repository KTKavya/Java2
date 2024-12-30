import java.io.File;
import java.io.IOException;

public class Filehandling1 {
    public static void main(String[] args) throws IOException {
        String fileName = "example2.txt";
        File file = new File(fileName);
        if (file.createNewFile()) {
            System.out.println("File Created Sucessfully");
        } else
        {
            System.out.println("File already exists");
        }

    }
}
