package chapter5;

public class Menu {
    public static void main(String args[])
        throws java.io.IOException {
            char choise;
            do{
                System.out.println("spravka po operatoru");
                System.out.println("    1.  if");
                System.out.println("    2.  switch");
                System.out.println("    3.  while");
                System.out.println("    4.  do-while");
                System.out.println("    5.  for\n");
                System.out.println("choise true point");
                choise =(char) System.in.read();
            } while (choise < '1' || choise > '5');
            System.out.println("\n");
            switch (choise) {
                case '1':
                    System.out.println("if:\n");
                    System.out.println("if(uslovie) operator:");
                    System.out.println("else operator");
                    break;
                case '2':
                    System.out.println("switch:\n");
                    System.out.println("switch (vyrajenie) (");
                    System.out.println(" case constant :");
                    System.out.println("posledovatelnost operatorov");
                    System.out.println(" break");
                    System.out.println(" // ...");
                    System.out.println(" )");
                    break;
                case '3':
                    System.out.println("while:\n");
                    System.out.println("while uslovie operator");
                    break;
                    case '4':
                        System.out.println("do-while:\n");
                        System.out.println("do (");
                        System.out.println("  operator;");
                        System.out.println(") while uslovie;");
                        break;
                case '5':
                    System.out.println("for:\n");
                    System.out.println("for (inicializacia; uslovie;)");
                    System.out.println("operator");
                    break;


            }
        }
    }

