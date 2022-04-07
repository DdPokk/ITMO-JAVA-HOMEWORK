package HOMEWORK3.part2;

import java.util.Arrays;
import java.util.Scanner;

public class part2 {

    public static void main(String[] args) {
        System.out.println("пункт1");
        pr1();
        System.out.println("пункт2");
        pr2();
        System.out.println("пункт3");
        pr3();
        System.out.println("пункт4");
        pr4();
        System.out.println("пункт5");
        pr5();
        System.out.println("пункт6");
        pr6();
    }

    //пункт 1
    public static void pr1() {
        int a = 1;
        while (a < 100) {
            if (a % 2 != 0)
                System.out.println(a);
            a++;
        }
    }

    //пункт 2
    public static void pr2() {
        int y = 1;
        while (y < 100) {
            if (y % 3 == 0 || y % 5 == 0) {
                if (y % 3 == 0 && y % 5 == 0)
                    System.out.println(y + " кратно 3 и 5");
                else if (y % 3 == 0)
                    System.out.println(y + " кратно 3");
                else System.out.println(y + " кратно 5");
            }
            y++;
        }
    }

    //пункт 3
    public static void pr3() {
        System.out.println("Введите первое число");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Введите второе число");
        int b = scan.nextInt();
        System.out.println("Введите их сумму");
        int c = scan.nextInt();
        if ((a + b) == c)
            System.out.println("true");
        else
            System.out.println("false");
    }

    //пункт 4
    public static void pr4() {
        System.out.println("Введите первое число");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("Введите второе число");
        int b = scan.nextInt();
        System.out.println("Введите третье число");
        int c = scan.nextInt();
        if (a < b && b < c)
            System.out.println("true");
        else
            System.out.println("false");
    }

    //пункт 5
    public static void pr5() {
        int[] a = new int[]{13, 58, 7, 9, 38, 52, 3};
        System.out.println("array = " + Arrays.toString(a));
        System.out.println("true");
    }

    //пункт 6
    public static void pr6() {
        System.out.println("Задание 6");
        int[] a = new int[]{13, 58, 7, 9, 38, 52, 3};
        System.out.println("Массив " + Arrays.toString(a));
        boolean result = false;
        for (int j : a) {
            if (j == 1 || j == 3) {
                result = true;
                break;
            }
        }
        System.out.println(result ? "true" : "false");
    }
}
