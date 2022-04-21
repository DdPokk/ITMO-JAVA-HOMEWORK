package HOMEWORK10;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class part10 {
    //пункт1
    public static List<String> fileToStringList(File file) {
        List<String> stringList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String input;
            while ((input = reader.readLine()) != null) {
                stringList.add(input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }
    //пункт2
    public static void text3(String string, File file) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, true))) {
            writer.append(string + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //пункт3
    public static void text4(File file1, File file2, File text4) {
        List<String> stringList1 = fileToStringList(file1);
        List<String> stringList2 = fileToStringList(file2);
        try {
            new FileWriter(text4, false);
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (String str : stringList1) {
            text3(str, text4);
        }
        for (String str : stringList2) {
            text3(str, text4);
        }
    }

    //пункт4
    public static void text5(File file) {
        List<String> stringList = fileToStringList(file);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, false))) {
            for (String str : stringList) {
                writer.append(str.replaceAll("\\W", "\\$") + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
