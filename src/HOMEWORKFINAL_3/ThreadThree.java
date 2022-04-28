package HOMEWORKFINAL_3;

public class ThreadThree extends Thread {
    private Counter counter;
    public ThreadThree(Counter counter){this.counter = counter;}

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();}
    }
    public static void main(String[] args) {
    Counter counter = new Counter();
        for (int i = 0; i < 100; i++) {
        ThreadThree thread = new ThreadThree(counter);
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
        System.out.println("count = " + counter.getCount());
}



}
