import java.io.FileOutputStream;
import java.io.IOException;

public class Filehandling5 {
    public static void main(String[] args) {
        String fileName="example5.txt";
        String content ="Welcome to Tata Strive\n";
        String content1 ="Welcome to Tata Strive";
        try(FileOutputStream fos = new FileOutputStream(fileName)) {
            byte[] bytes = content.getBytes();
            byte[] bytes1 = content1.getBytes();
            fos.write(bytes);
            fos.write(bytes1);
            System.out.println("content has been written to the file.");
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
