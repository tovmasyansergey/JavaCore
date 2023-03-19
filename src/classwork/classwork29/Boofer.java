package classwork.classwork29;

import java.io.*;

public class Boofer {
    public static void main(String[] args) throws IOException {
        Student student = new Student("poxos","poxosyan","gggg",15);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE));
        objectOutputStream.writeObject(student);


    }
    private static final String FILE ="C:\\Users\\user1\\IdeaProjects\\JavaCore\\src\\classwork\\classwork29\\poxos.txt.java";
    public static void write() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(FILE));
        bw.write("hello");
        bw.write("java");
    }
    public static void read() throws IOException {
        BufferedReader inputStream = new BufferedReader(new FileReader(FILE));
        inputStream.read();
        inputStream.readLine();//tox tox kardum e
    }
}
