package HOMEWORKFINAL_3;

public class Counter {
    private volatile
    int count = 0;

    public void increment() {
        count = count + 1;
    }
    public int getCount() {
        return count;
    }
}

