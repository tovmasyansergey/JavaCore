package chapter.chapter7;

public class VarArgs2 {
    static void vaTest (String msg,int ... v){
        System.out.println(msg + v.length + "inlude :");
        for (int i : v) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        vaTest("one parametr of lrt length");
        vaTest("three parametr of let length: " ,1 ,3,5);
        vaTest("without parametr let length :");
    }
}
