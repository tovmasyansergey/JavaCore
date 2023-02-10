package homework.homework10;

import chapter.chapter7.exersize14.StaticDemo;

public class BraceChecker {

    private String text;

    BraceChecker(String text) {
        this.text = text;

    }

    public void check() {
        Stack stck = new Stack();
        char last;
        for (int i = 0; i < text.length(); i++) {
            char a = text.charAt(i);
            switch (a) {
                case '(':
                case '{':
                case '[':
                    stck.push(text.charAt(i));
                    break;
                case ')':
                    last = stck.pop();
                    if (last != ')') {
                        System.out.println("open"+last+ "but not closed at"+ i);
                    } else if (last == '-') {
                        System.out.println("error at " + i + "closed ) but not opened");
                    }
                    break;

                case '}':
                    last = stck.pop();

                    if (last != '{') {
                        System.out.println("open  " + last + " but not closed at " + i);
                    } else if (last == '-') {
                        System.out.println("error at " + i + "closed } but not opened");
                    }
                    break;
                case ']':
                    last = stck.pop();
                    if (last != '[') {
                        System.out.println("open [ but not closed " + i);
                    }
                {
                    System.out.println("error at" + i + "closed ] but not opened");
                }
                break;

            }


        }
        while ((last = stck.pop()) != '-') {
            System.out.println("error open" + last + "but mot closed");


        }
    }


}