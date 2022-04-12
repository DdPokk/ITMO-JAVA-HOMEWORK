package HOMEWORK6;
import java.util.Scanner;

public class Father {
    private int number;

    public void setNumber() {
        System.out.println("¬ведите целое число:");
        Scanner in = new Scanner(System.in);
        number = in.nextInt();
    }
    public int getNumber(){
        return number;
    }
}
