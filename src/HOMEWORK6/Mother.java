package HOMEWORK6;
import java.util.Scanner;

public class Mother {
    private int age;
    public Scanner in = new Scanner(System.in);

    public void setInfo() {
        System.out.println("������� �����:");
        age = in.nextInt();
    }

    public int getAge() {
        return age;
    }
}
