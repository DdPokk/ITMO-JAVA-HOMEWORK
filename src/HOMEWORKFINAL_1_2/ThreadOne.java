package HOMEWORKFINAL_1_2;

public class ThreadOne  extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            i++;
            System.out.println(i);
        }
    }
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            ThreadOne thread = new ThreadOne();
            System.out.println(thread.getName() + ": " + thread.getState());
            thread.start();
            System.out.println(thread.getName() + ": " + thread.getState());
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(thread.getName() + ": " + thread.getState());
        }
    }
}