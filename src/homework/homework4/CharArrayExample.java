package homework.homework4;

public class CharArrayExample {
    public static void main(String[] args) {
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int points = 0;
        for (int x : chars) {
            if (x == c)
                points = points + 1;

        }
        System.out.println(points);
        System.out.print(chars[(chars.length - 1) / 2]);
        System.out.print(chars[(chars.length / 2)]);
        System.out.println();
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        boolean m = chars3[(chars3.length - 2)] == 'l' && chars3[chars3.length - 1] == 'y' ? true : false;
        System.out.println(m);
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ')
                System.out.print(text[i]);

        }
    }
}
