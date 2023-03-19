package classwork.classwork29;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) throws IOException {
        String directoryPath = "\\Users\\user1\\IdeaProjects\\JavaCore\\src\\classwork\\classwork29\\FileExample.java";
        String path = "C:\\Users\\user1\\IdeaProjects\\JavaCore\\src\\classwork\\classwork26";
        File file = new File(path);
        String property = System.getProperty("user.dir");
        System.out.println(property);
        System.out.println("isDirectory " + file.isDirectory());//harcnum e papka e te che
        System.out.println("isFile " + file.isFile());//harcnum e file e te che
        System.out.println("exsist " + file.exists());//harcnum e fayly ka te che
        File directory = new File(directoryPath);
        if (!directory.exists()){
            directory.mkdir();
        }
//        String[] list = directory.list();
//        for (String s : list) {
//            System.out.println(s);
//        }
//        if (directory.canWrite()){
//            directory.setWritable(true);
//        if (file.exists()) {
//            System.out.println("file exist");
//        } else {
            boolean newFile = file.createNewFile();
            if (newFile) {
                System.out.println("file is created");
            } else {
                System.out.println("file is not created");
            }
        }

    }

