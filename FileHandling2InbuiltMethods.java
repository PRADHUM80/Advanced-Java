import java.io.File;

public class FileHandling2InbuiltMethods {
    public static void main(String[] args) {
        
        String path1 = "C:\\FileHandling\\input.txt";

        File f = new File(path1);

        System.out.println(f.canRead());
        System.out.println(f.canWrite());
        System.out.println(f.canExecute());
        System.out.println(f.isFile());
        System.out.println(f.isDirectory());
        System.out.println(f.getAbsolutePath());
    }
}
