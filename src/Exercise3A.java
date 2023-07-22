public class Exercise3A {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();

        a.start();
        b.start();
    }
}

class ThreadA extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 3; i < 100; i += 3) {
                System.out.println("A: "+i);
                sleep(300);
            }
        } catch (InterruptedException e) {}
    }
}

class ThreadB extends Thread {
    @Override
    public void run() {
        try {
            for (int i = 5; i < 100; i+=5) {
                System.out.println("B: "+i);
                sleep(500);
            }
        } catch (InterruptedException e) {}
    }
}