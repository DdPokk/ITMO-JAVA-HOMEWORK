package HOMEWORK1;
import java.util.Scanner;

public class lesson1 {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // пункт 1
        System.out.println("Пункт 1");
        String string1 = "Я";
        String string2 = "плохо";
        String string3 = "знаю";
        String string4 = "Java";

        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
        System.out.println(string4);

        // пункт 2
        System.out.println("Пункт 2");
        double a = 46;
        double b = 10;
        double c = 10;
        double d = 3;
        double Result1 = (a + b) * (c / d);
        System.out.println(Result1);

        int e = 29;
        int f = 4;
        int g = -15;
        int Result2 = e * f * g;
        System.out.println(Result2);

        // пункт 3
        System.out.println("Пункт 3");
        double number = 10500;
        double result3 = (number / 10) / 10;
        System.out.println(result3);

        // пункт 4
        System.out.println("Пункт 4");
        double k = 3.6;
        double l = 4.1;
        double m = 5.9;
        double Result4 = k * l * m;
        System.out.println(Result4);

        //пункт 5
        System.out.println("Пункт 5");
        System.out.println("Введите первое число");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        System.out.println("Введите второе число");
        int num2 = scan.nextInt();
        System.out.println("Введите третье число");
        int num3 = scan.nextInt();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

        // пункт 6
        System.out.println("Пункт 6");
        System.out.println("Введите число для проверки");
        int numb = scan.nextInt();
        if (numb % 2 == 0 && numb < 101) {
            System.out.println("Четное");
        } else if (numb % 2 != 0) {
            System.out.println("Нечетное");
        } else {
            System.out.println("Выход за пределы диапазоны");
        }
        if (numb % 2 != 0) {
            System.out.println(numb);
        }
    }
}