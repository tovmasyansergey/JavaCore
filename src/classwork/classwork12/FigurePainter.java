package classwork.classwork12;

public class FigurePainter {
    void figureOne(int a){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
    void figureTwo(){
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
    void figureThree(){
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }



}
