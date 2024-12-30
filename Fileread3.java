//File.readAlllines Method
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Fileread3 {
    public static void main(String[] args) {
        String fileName = "example2.txt";
        try {
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            for(String line:lines){
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}