import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling1 {
    public static void main(String[] args) throws IOException {
        String path1 = "C:\\FileHandling\\input.txt";
        String path2 = "C:\\FileHandling\\output.txt";


        // Connection done Here
        FileInputStream fis = new FileInputStream(path1);
        FileOutputStream fos = new FileOutputStream(path2);

        // 
        int data;

        while((data = fis.read()) != -1) 
        {
            fos.write(data);
        }
        System.out.println("Happy No BP");
        fis.close();
        fos.close();
    }
}
