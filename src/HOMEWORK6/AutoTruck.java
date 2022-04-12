package HOMEWORK6;

public class AutoTruck extends Auto {
    private int numberOfWheels;

    public AutoTruck(int w, String m, char c, float s, int numberOfWheels, int maxWeight) {
        super(w, m, c, s);
        this.numberOfWheels = numberOfWheels;
    }

        public void newWheels(int numberOfWheels){
        this.numberOfWheels = numberOfWheels;
        System.out.println("Количество колёс: " + numberOfWheels);
    }
}
