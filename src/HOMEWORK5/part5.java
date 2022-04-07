package HOMEWORK5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class part5 {
    public static String pr1(String string) {
        int a = 0;
        int b = 0;
        int lenString = string.length();
        String max = "";
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < lenString; i++) {
            char charInString = string.charAt(i);
            if (!Character.isLetter(charInString)) {
                if (a < b) {
                    a = b;
                    max = word.toString();
                }
                b = 0;
                word.setLength(0);
            } else {
                b++;
                word.append(charInString);
                if (i == lenString - 1 && a < b) {
                    max = word.toString();
                }
            }
        }
        return max;
    }

    public static boolean pr2(String string) {
        String stringLow = string.toLowerCase();
        return (stringLow.equals(new StringBuilder(stringLow).reverse().toString()));
    }

    public static String pr3(String string) {
        String stringLow = string.toLowerCase();
        return (stringLow.replaceAll("áÿêà", "[âûðåçàíî öåíçóðîé]"));
    }

    public static int pr4(String string, String subString) {
        Pattern c = Pattern.compile(subString);
        Matcher d = c.matcher(string);
        int count = 0;
        while (d.find()) {
            count++;
        }
        return count;
    }

    public static void pr5(String string) {
        System.out.println("The given string is: " + string);
        String[] stringArr = string.split(" ");
        StringBuilder stringRev = new StringBuilder();
        for (String word : stringArr) {
            stringRev.append(new StringBuilder(word).reverse()).append(" ");
        }
        System.out.println("The string reversed word by word is: " + stringRev);
    }

    public static void main(String[] args) {
        System.out.println("ïóíêò1");
        System.out.println(pr1("ôôôôôôôôôôôôôôôôôôôô/// ââââââââââââ"));
        System.out.println("ïóíêò2");
        System.out.println(pr2("ïàððàï"));
        System.out.println("ïóíêò3");
        System.out.println(pr3("àààààààààààà áÿêà!"));
        System.out.println("ïóíêò4");
        System.out.println(pr4("aaaaaaaaaaaaa vvvvvv ff ds ff vvvvvvvvvvvvvvvvvv", "ff"));
        System.out.println("ïóíêò5");
        pr5("asd rty sahsfh GHGDvcgf");
    }

}
