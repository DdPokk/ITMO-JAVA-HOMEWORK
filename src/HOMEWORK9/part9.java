package HOMEWORK9;
import java.util.*;

public class part9 {
    //пункт 2
    public static Set<Object> noDuplicates(List list) {
        return new HashSet<Object>(list);
    }

    //пункт 3
    public static List<Object> oneMillionElements(String string) {
        if (string.equals("arrayList")) {
            List<Object> arrayList = new ArrayList<>();
            Random random = new Random();
            for (int i = 0; i < 1000000; i++) {
                arrayList.add(random.nextInt(1000));
            }
            return arrayList;
        } else if (string.equals("linkedList")) {
            List<Object> linkedList = new LinkedList<>();
            Random random = new Random();
            for (int i = 0; i < 1000000; i++) {
                linkedList.add(random.nextInt(1000));
            }
            return linkedList;
        } else {
            System.out.println("Неккорректный ввод");
            return new ArrayList<>();
        }
    }
    public static void searchTime(String string) {
        List<Object> list = oneMillionElements(string);
        Random random = new Random();
        long time = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.get(random.nextInt(1000000));
        }
        System.out.println(System.currentTimeMillis() - time);
    }

    //пункт 4
    public static void userGamePoints(Map<User, Integer> map) {
        Scanner in = new Scanner(System.in);
        String userName = in.nextLine();
        Set<User> keys = map.keySet();
        for (User user : keys) {
            if (userName.equals(user.getName())) {
                System.out.println("Пользователь: " + userName + "   Очки: " + map.get(user));
                return;
            }
        }
        System.out.println("Пользователь с таким именем не зарегистрирован");
    }
}
