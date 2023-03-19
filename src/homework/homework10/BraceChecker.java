package homework.homework10;

import chapter.chapter7.exersize14.StaticDemo;

public class BraceChecker {

    private String text;

    public BraceChecker(String text) {
        this.text = text;

    }

    public void check() {
        Stack stck = new Stack();
        int last;
        char lastBracket;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stck.push(text.charAt(i));
                    break;
                case ')':
                    last = stck.pop();
                    if (last == 0) {
                        System.out.println("error at " + i + "closed " + c + " but not opened");
                    } else {
                        lastBracket = (char) last;
                        if (lastBracket != '(') {
                            System.out.println("error at " + i + "openned " + lastBracket + "but closed " + c);
                        }
                    }
                    break;

                case '}':
                    last = stck.pop();
                    if (last == 0) {
                        System.out.println("error at " + i + "closed " + c + " but not opened");
                    } else {
                        lastBracket = (char) last;
                        if (lastBracket != '{') {
                            System.out.println("error at " + i + "openned " + lastBracket + "but closed " + c);
                        }
                    }
                    break;
                case ']':
                    last = stck.pop();
                    if (last == 0) {
                        System.out.println("error at " + i + "closed " + c + " but not opened");
                    } else {
                        lastBracket = (char) last;
                        if (lastBracket != '[') {
                            System.out.println("error at " + i + "openned " + lastBracket + "but closed " + c);
                        }
                    }
                    break;

            }


        }
//        while ( (lastBracket = (char)stck.pop() )!= 0){
//            System.out.println("error opened " + lastBracket + "but not closed");
//        }
while (!stck.isEmpty()){
    System.out.println("error is " + (char)stck.pop()+"but not closed");
}
    }


}