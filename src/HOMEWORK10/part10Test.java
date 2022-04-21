package HOMEWORK10;
import java.io.*;
import java.util.Arrays;
import java.util.List;

public class part10Test {
    public static void main(String[] args) {
        File file1 = new File("files/text1.txt");
        File file2 = new File("files/text2.txt");
        File text4 = new File("files/text4.txt");
        File text3 = new File("files/text3.txt");
        File text5 = new File("files/text5.txt");

        System.out.println("пункт1");
        List fileList = part10.fileToStringList(file1);
        fileList.forEach(System.out::println);

        System.out.println("пункт2");
        part10.text3("aaaaaaaaabbbbbbbbbbbcccccccccc", text3);
        System.out.println("Смотри файл text3.txt");

        System.out.println("пункт3");
        part10.text4(file1, file2,text4);
        System.out.println("Смотри файл text4.txt");

        System.out.println("пункт4");
        part10.text5(text5);
        System.out.println("Смотри файл text5.txt");
    }
}