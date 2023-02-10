package chapter.chapter2;

public class ForTest {
    public static void main(String[] args) {
      /*  int x;
        for (x = 0; x < 10; x = x + 1)
        System.out.println("znachenie x = " + x);
    }
}
*/
     /*   int x, y;
        for (x = 10; x > 0; x = x - 1)


        System.out.println("znachenie x =" + x +"="+ y);
        for (y = 0; y < 10;y = y + 1);
    }
}*/
        int x , y ;
        y = 20;
        for(x = 0;x < 10;x = x+1 ){
            System.out.println("znachenie x = " + x);
            System.out.println("znachenie y = " + y);
            y = y - 2;
        }
    }
}