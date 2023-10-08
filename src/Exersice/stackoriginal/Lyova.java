package Exersice.stackoriginal;

public class Lyova {
    public static void main(String[] args) {
        String text = "Some text{){P}";
        char tochar[] = text.toCharArray();
        int x = 0;
        int z = 0;
        int y = 0;
        int t = 0;
        int massiveforx[] = new int[tochar.length];
        for (int i = tochar.length - 1; i > 0; i--) {
            char newchar = tochar[i];
            switch (newchar) {
                case '(':
                    t--;
                    break;
                case ')':
                    t++;
                    break;
            }
            if (t < 0) {
                System.out.println("<< ( >> is opened without being closed in " + (i + 1) + "-st");
                t = 0;
                continue;
            }
        }
        for (int i = 0; i < tochar.length; i++) {
            char newchar = tochar[i];
            switch (newchar) {
                case '(':
                    x++;
                    z++;
                    break;
                case ')':
                    x--;
                    z--;
                    break;
            }
            if (x < 0) {
                System.out.println("<< ) >> is closed without being opened in " + (i + 1) + "-st");
                x = 0;
                continue;
            }
        }
        if (z == 0) {
            System.out.println("<< ( ) >> are opened and closed by RIGHT way");
        }
        z = 0;
        t = 0;
        for (int i = tochar.length - 1; i > 0; i--) {
            char newchar = tochar[i];
            switch (newchar) {
                case '{':
                    t--;
                    break;
                case '}':
                    t++;
                    break;
            }
            if (t < 0) {
                System.out.println("<< { >> is opened without being closed in " + (i + 1) + "-st");
                t = 0;
                continue;
            }
        }
        for (int i = 0; i < tochar.length; i++) {
            char newchar = tochar[i];
            switch (newchar) {
                case '{':
                    y++;
                    z++;
                    break;
                case '}':
                    y--;
                    z--;
                    break;
            }
            if (y < 0) {
                System.out.println("<< } >> is closed without being opened in " + (i + 1) + "-st");
                break;
            }
        }
        if (z == 0) {
            System.out.println("<< { } >> are opened and closed by RIGHT way");
        }
    }
}
