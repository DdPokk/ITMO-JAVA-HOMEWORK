package HOMEWORK6;

public class Daughter extends Mother {
    private String name;

    @Override
    public void setInfo() {
        System.out.println("������� ��� ������������:");
        name = in.nextLine();
    }

    public String getName() {
        return name;
    }
}
