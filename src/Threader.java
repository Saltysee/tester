import java.lang.Thread;

public class Threader {
    public static void main(String args[]) {

        Thread thread = new Thread() {
            public void run() {
                for (int i = 0; i < 10; i += 2) {
                    System.out.println("hello");
                }
            }
        };

        Thread threadTwo = new Thread() {
            public void run(){
                for (int i = 0; i < 10; i += 2) {
                    System.out.println("Hello this lol");
                }
            }
        };

        thread.start();

        threadTwo.start();
    }
}
