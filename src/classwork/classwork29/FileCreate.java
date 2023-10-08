package classwork.classwork29;

import java.io.File;
import java.io.IOException;
import java.io.*;

public class FileCreate {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\user1\\IdeaProjects\\JavaCore\\src\\classwork\\classwork29\\file.txt.java";
        File file = new File(path);
        file.createNewFile();
        System.out.println(file.length());
        String path1 = "C:\\Users\\user1\\IdeaProjects\\JavaCore\\src\\classwork\\classwork29\\example20.txt";
        File file1 =new File(path1);
        file1.createNewFile();
    }
}
