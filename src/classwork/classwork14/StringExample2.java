package classwork.classwork14;

public class StringExample2 {
    public static void main(String[] args) {
        String name = "poxos poxos poxos";
        char[] chars = name.toCharArray();
        for (int i = 0; i < name.length(); i++) {
            System.err.println(name.charAt(i));
        }
       String[] aname = name.split(" ");
        for (String s : aname) {
            System.out.println(s);

        }

    }
}
