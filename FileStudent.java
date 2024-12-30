import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileStudent {
    public static void main(String[] args) throws IOException {
        String fileName = "Student1.txt";
        File file = new File(fileName);
         {
             System.out.println("Student Details:");
        }
            FileWriter writer = new FileWriter(file);
            writer.write("Name:Kavya\n");
            writer.write("Branch:MCA\n");
            writer.write("USN:2VX22MC046\n");
            writer.write("age:"+22);
            writer.close();
        {
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            for (String line : lines) {
                System.out.println(line);
            }
        }
        }
        }


