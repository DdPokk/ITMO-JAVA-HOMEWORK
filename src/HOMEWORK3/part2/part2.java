package HOMEWORK3.part2;

import java.util.Arrays;
import java.util.Scanner;

public class part2 {

    public static void main(String[] args) {
        System.out.println("�����1");
        pr1();
        System.out.println("�����2");
        pr2();
        System.out.println("�����3");
        pr3();
        System.out.println("�����4");
        pr4();
        System.out.println("�����5");
        pr5();
        System.out.println("�����6");
        pr6();
    }

    //����� 1
    public static void pr1() {
        int a = 1;
        while (a < 100) {
            if (a % 2 != 0)
                System.out.println(a);
            a++;
        }
    }

    //����� 2
    public static void pr2() {
        int y = 1;
        while (y < 100) {
            if (y % 3 == 0 || y % 5 == 0) {
                if (y % 3 == 0 && y % 5 == 0)
                    System.out.println(y + " ������ 3 � 5");
                else if (y % 3 == 0)
                    System.out.println(y + " ������ 3");
                else System.out.println(y + " ������ 5");
            }
            y++;
        }
    }

    //����� 3
    public static void pr3() {
        System.out.println("������� ������ �����");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("������� ������ �����");
        int b = scan.nextInt();
        System.out.println("������� �� �����");
        int c = scan.nextInt();
        if ((a + b) == c)
            System.out.println("true");
        else
            System.out.println("false");
    }

    //����� 4
    public static void pr4() {
        System.out.println("������� ������ �����");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println("������� ������ �����");
        int b = scan.nextInt();
        System.out.println("������� ������ �����");
        int c = scan.nextInt();
        if (a < b && b < c)
            System.out.println("true");
        else
            System.out.println("false");
    }

    //����� 5
    public static void pr5() {
        int[] a = new int[]{13, 58, 7, 9, 38, 52, 3};
        System.out.println("array = " + Arrays.toString(a));
        System.out.println("true");
    }

    //����� 6
    public static void pr6() {
        System.out.println("������� 6");
        int[] a = new int[]{13, 58, 7, 9, 38, 52, 3};
        System.out.println("������ " + Arrays.toString(a));
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
