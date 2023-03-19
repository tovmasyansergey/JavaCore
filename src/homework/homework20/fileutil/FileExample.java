package homework.homework20.fileutil;

import java.io.File;
import java.util.Scanner;

public class FileExample {

    public static void main(String[] args) {
        String path = "C:\\Users\\user1\\IdeaProjects\\JavaCore\\src\\homework\\homework20\\fileutil\\ФайлFileUtil.java.url";
        File file = new File(path);
        Scanner scanner = new Scanner(path);
        System.out.println(  scanner.nextLine());
    }
}
