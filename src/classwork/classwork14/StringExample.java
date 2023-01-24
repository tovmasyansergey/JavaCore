package classwork.classwork14;

public class StringExample {
    public static void main(String[] args) {
        String fullName = "  poxos poxooPPPsyan     ";

        System.out.println(fullName.toLowerCase());
        System.out.println(fullName.toUpperCase());
        System.out.println(fullName.trim());
        System.out.println(fullName.substring(2));
        System.out.println(fullName.substring(2, 7));
        System.out.println(fullName.startsWith("   "));
        System.out.println(fullName.endsWith("   "));
        System.out.println(fullName.contains("p"));
        System.out.println(fullName.length());
        System.out.println(fullName.charAt(4));
        for (int i = 0; i < fullName.length(); i++) {
            System.out.print(fullName.charAt(i));
            String name = "ffdfee fg wetwftg";
            String[] names = fullName.split(" ");
            for (String namely : names) {
                System.out.println(namely);
            }
        }
    }
}
