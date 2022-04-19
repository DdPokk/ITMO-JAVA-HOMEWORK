package HOMEWORK9;
import java.util.*;

public class part9Test {
    public static void main(String[] args) {
        System.out.println("--------");
        List<Integer> list1 = Arrays.asList(1, 2, 3, 3, 4, 2);
        List list2 = Arrays.asList("a", "b", "c", "d", "b", 4.5);
        System.out.println(part9.noDuplicates(list1));
        System.out.println(part9.noDuplicates(list2));

        System.out.println("--------");
        part9.searchTime("arrayList");
        part9.searchTime("linkedList");

        System.out.println("--------");
        User oleg = new User();
        oleg.setName("Олег");
        User katya = new User();
        katya.setName("Катя");
        User dima = new User();
        dima.setName("Дима");

        Map<User, Integer> gamePoints = new HashMap<>();
        gamePoints.put(oleg, 50);
        gamePoints.put(katya, 60);
        gamePoints.put(dima, 105);

        part9.userPoints(gamePoints);
    }
}
