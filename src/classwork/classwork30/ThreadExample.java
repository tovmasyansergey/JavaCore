package classwork.classwork30;

public class ThreadExample {
    public static void main(String[] args)  {
/*
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());
        System.out.println(thread);
*/
        Thread myNewThread = new Thread(new MyThread(),"My Thread");
        myNewThread.start();
        for (int i = 1; i < 6; i++) {
            System.out.println("main thread " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
