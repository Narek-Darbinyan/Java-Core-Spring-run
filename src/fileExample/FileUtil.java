package fileExample;

import java.io.File;
import java.io.IOException;

public class FileUtil {
    public static void main(String[] args) throws IOException {
        String path = "D:\\1164.poxos.txt";
        File file = new File(path);
        System.out.println("isDirectory:" + file.isDirectory());
        if (file.exists()) {
            System.out.println("file exists");
        } else {
            boolean newFile = file.createNewFile();
            if (newFile){
                System.out.println("File created");
            }else {
                System.out.println("File not created");
            }
        }
    }
}
