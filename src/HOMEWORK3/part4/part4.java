package HOMEWORK3.part4;

import java.util.Arrays;
import java.util.Scanner;

public class part4 {
    public static void main(String[] args) {
        int[] arrr1 = new int[]{1, 2, 2, 4, 5};
        System.out.println("�����1");pr1(arrr1);
        System.out.println("�����2");pr2();
       System.out.println("�����3");pr3();
        System.out.println("�����4");pr4();

    }

    // �����1
    public static void pr1(int[] arr) {
        boolean result = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1])
                result = true;
            else {
                result = false;
                System.out.println("Please, try again");
                break;
            }
        }
        if (result)
            System.out.println("OK");
    }
    //�����2
    public static int[] pr2() {
        Scanner scan = new Scanner(System.in);
        System.out.println("������� ����� �������: ");
        int arrLength = scan.nextInt();
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            System.out.println("������� ����� " + (i + 1) + " �������:");
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    //�����3
    public static void pr3() {
        int[] arr = pr2();
        int firstElement = arr[0];
        int lastElement = arr[arr.length - 1];
        arr[0] = lastElement;
        arr[arr.length - 1] = firstElement;
        System.out.println("����� ������: ");
        System.out.println(Arrays.toString(arr));
    }
    //�����4
    public static void pr4() {
        int[] arr = new int[]{1, 2, 3, 1, 2, 4};
        for (int i : arr) {
            int count = 0;
            for (int j : arr) {
                if (i == j)
                    count++;
            }
            if (count == 1) {
                System.out.println(i);
                break;
            }
        }
    }
    //�����5


}
