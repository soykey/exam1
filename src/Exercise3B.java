import static java.lang.Thread.sleep;

public class Exercise3B {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            public void run() {
                try {
                    for (int i = 3; i < 100; i += 3) {
                        System.out.println("A: "+i);
                        sleep(300);
                    }
                } catch (InterruptedException e) {}
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                try {
                    for (int i = 5; i < 100; i+=5) {
                        System.out.println("B: "+i);
                        sleep(500);
                    }
                } catch (InterruptedException e) {}
            }
        }).start();
    }
}
