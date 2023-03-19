package classwork.classwork29;

import java.io.*;

public class Createfile {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\user1\\IdeaProjects\\JavaCore\\src\\classwork\\classwork29\\poxos.txt.java";
        File file = new File(path);
        file.createNewFile();
        write();
       read();
    }
    private static final String FILE_PATH = "C:\\Users\\user1\\IdeaProjects\\JavaCore\\src\\classwork\\classwork29\\poxos.txt.java";
    public static void write() throws IOException{

        DataOutputStream out = new DataOutputStream(new FileOutputStream(FILE_PATH));
        out.writeInt(90);
        out.writeBoolean(true);

        out.close();
    }
    public static void read()  throws IOException{
        DataInputStream inputStream = new DataInputStream(new FileInputStream(FILE_PATH));
        System.out.println(inputStream.readInt());
        System.out.println(inputStream.readBoolean());
        inputStream.close();
    }
}

