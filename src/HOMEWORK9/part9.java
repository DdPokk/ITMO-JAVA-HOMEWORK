package HOMEWORK9;
import java.util.*;

public class part9 {
    //����� 2
    public static Set<Object> noDuplicates(List list) {
        return new HashSet<Object>(list);
    }

    //����� 3
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
            System.out.println("������������� ����");
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

    //����� 4
    public static void userGamePoints(Map<User, Integer> map) {
        Scanner in = new Scanner(System.in);
        String userName = in.nextLine();
        Set<User> keys = map.keySet();
        for (User user : keys) {
            if (userName.equals(user.getName())) {
                System.out.println("������������: " + userName + "   ����: " + map.get(user));
                return;
            }
        }
        System.out.println("������������ � ����� ������ �� ���������������");
    }
}
