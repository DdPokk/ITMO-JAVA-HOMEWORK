package HOMEWORK7;

public class TestAir {
    public static void main(String[] args) {
        Air.Wing wing1 = new Air.Wing();
        wing1.setWingWeight(10);
        wing1.printWingWeight();
        Air.Wing wing2 = new Air.Wing();
        wing2.setWingWeight(22);
        wing2.printWingWeight();
    }
}
