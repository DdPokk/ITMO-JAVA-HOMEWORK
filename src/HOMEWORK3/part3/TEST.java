package HOMEWORK3.part3;

public class TEST {
    public static void main(String[] args){

        //Study
        Study testStudy = new Study("�������� Java - ��� ������!");
        System.out.println(testStudy.printCourse());

        //Car
        Car car1 = new Car("�������","Toyota",7);
        Car car2 = new Car("�����","Bmw",5);
        System.out.println(car1.printCar());
        System.out.println(car2.printCar());

        //House
        House house1 = new House();
        House house2 = new House();
        house1.setHouse(3,2010,"����-����");
        house2.setHouse(50,2004,"���������");
        System.out.println(house1.getHouse());
        System.out.println(house2.getHouse());
        System.out.println(house1.getYears());
        System.out.println(house2.getYears());

        //Tree
        Tree tree1 = new Tree();
        Tree tree2 = new Tree("������",true, 80);
        Tree tree3 = new Tree("���", true, 35);
        tree1.treeInfo();
        tree2.treeInfo();
        tree3.treeInfo();
    }
}
