package input_output_Streams;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Path3 {
    public static void main(String[] args) {

        Path testFilePath = Paths.get("C:\\Users\\Username\\Desktop\\testFile.txt");

        System.out.println(testFilePath.isAbsolute());
    }
}
