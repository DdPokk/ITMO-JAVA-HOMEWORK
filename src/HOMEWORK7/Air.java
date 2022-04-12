package HOMEWORK7;

public class Air {
    public static class Wing {
        private double wingWeight;

        public void setWingWeight(double wingWeight) {
            this.wingWeight = wingWeight;
        }

        public double getWingWeight() {
            return wingWeight;
        }

        public void printWingWeight() {
            System.out.println(wingWeight);
        }
    }

    public static void main(String[] args) {
        Air.Wing wing1 = new Air.Wing();
        wing1.setWingWeight(10);
        wing1.printWingWeight();
        Air.Wing wing2 = new Air.Wing();
        wing2.setWingWeight(22);
        wing2.printWingWeight();
    }
}
