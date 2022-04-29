package HOMEWORKFINAL_4_2;

public class ThreadFour {
    public static void main(String[] args)  {
        ThreadFour.NameThread();
    }
    public static void NameThread(){
        Object lock = new Object();
        class ThreadBuild extends Thread {
            @Override
            public void run() {
                while (true){
                    synchronized (lock) {
                        lock.notify();
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(currentThread().getName());
                        try {
                            Thread.sleep(10);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        ThreadBuild thread1 = new ThreadBuild();
        thread1.start();
        ThreadBuild thread2 = new ThreadBuild();
        thread2.start();}
}
