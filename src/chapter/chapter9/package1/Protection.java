package chapter.chapter9.package1;

public class Protection {

        int n = 1;
        private int a = 2;
        protected int b = 3;
        public int c = 4;

    public Protection() {
            System.out.println("constructor of main class");
            System.out.println(" n = " + n);
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("c = " + c);
        }
    }

    class Derived extends Protection {
        Derived() {
            System.out.println("constructor of subclass");
            System.out.println("n = " + n);
            System.out.println("b = " + b);
            System.out.println("c = + c");
        }
    }

    class SamePackage extends Protection {
        SamePackage() {
            Protection p = new Protection();
            System.out.println("constructor of the same package");
            System.out.println(" n = " + n);
            System.out.println("b = " + b);
            System.out.println("c = + c");
        }
    }
