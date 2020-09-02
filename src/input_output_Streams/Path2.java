package input_output_Streams;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Path2 {
    public static void main(String[] args) {

        Path testFilePath = Paths.get("C:\\Users\\Username\\Desktop\\testFile.txt");

        System.out.println(testFilePath.endsWith("estFile.txt"));
        System.out.println(testFilePath.endsWith("Desktop\\testFile.txt"));
    }
}
