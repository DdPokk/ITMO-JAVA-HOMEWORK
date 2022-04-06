package HOMEWORK3.part3;

public class Tree {
    private String name;
    private boolean live;
    private int age;

    public Tree(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Tree(String name, boolean alive, int age) {
        this.name = name;
        this.live = alive;
        this.age = age;
    }

    public Tree() {
        System.out.println("������ ����������� ��� ���������� ��������");
    }

    public void treeInfo() {
        System.out.println("������ " + name + " " + age + " ���, ��� " + (live ? "�����" : "�� �����"));
    }
}
