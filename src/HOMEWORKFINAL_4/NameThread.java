package HOMEWORKFINAL_4;

public class NameThread implements Runnable {
    private String name;
    private static final Object vivid = new Object();

    public NameThread(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        try {
            while (true) {
                synchronized (vivid) {
                    vivid.notifyAll();
                    vivid.wait();
                    System.out.println(name);
                }
            }
        } catch (InterruptedException e) {
            System.out.println("Error");
        }
    }
    public static void main(String[] args) {
        NameThread thread1 = new NameThread("thread 1");
        NameThread thread2 = new NameThread("thread 2");
        new Thread(thread1).start();
        new Thread(thread2).start();
    }
}
