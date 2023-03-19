package classwork.classwork26;

public class StorageDemo {
    public static void main(String[] args) {
        Storage<Book> bookStorage = new Storage<>();
        Storage<Student> studentStorage = new Storage<>();
        Storage<String> nameStorage = new Storage<>();
        Storage<Integer> numbers = new Storage<>();
        nameStorage.add("poxos");
        nameStorage.add("petros");
        numbers.add(8);

        Student student = new Student("poxos", "poxosyan", 13);
        Book book = new Book("girq", "description", 100);
        bookStorage.add(book);
        studentStorage.add(student);
        Student byIndex = studentStorage.getByIndex(0);
        System.out.println(byIndex.getName());
    }
}

