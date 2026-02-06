package maratonajava.javacore.ZZFthreads.test;

class ThreadExampleRunnable implements Runnable {

    private final char c;

    public ThreadExampleRunnable(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if( i % 100 == 0) {
                System.out.println();
            }
        }
    }
}

public class ThreadTest01 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadExampleRunnable('A'), "t1");
        Thread t2 = new Thread(new ThreadExampleRunnable('B'), "t2");
        Thread t3 = new Thread(new ThreadExampleRunnable('C'), "t3");
        Thread t4 = new Thread(new ThreadExampleRunnable('C'), "t4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
