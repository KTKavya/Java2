//File.reader.read method
import java.io.FileReader;
import java.io.IOException;

public class FileReadEx1 {
    public static void main(String[] args) {
        String fileName = "example6.txt";
        try (FileReader reader = new FileReader(fileName)) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.println((char) character);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}