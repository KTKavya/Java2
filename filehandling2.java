import java.io.FileOutputStream;
import java.io.IOException;

public class filehandling2 {
    public static void main(String[] args) {
        String fileName="example1.txt";
        try(FileOutputStream fos = new FileOutputStream(fileName)){
            System.out.println("File created Succesfully");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
