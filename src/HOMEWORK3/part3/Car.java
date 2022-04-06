package HOMEWORK3.part3;

public class Car {
    private String color;
    private String name;
    private int weight;

    public Car() {
    }

    public Car(String color) {
        this.color = color;
    }

    public Car(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Car(String color,String name, int weight) {
        this.color = color;
        this.name = name;
        this.weight = weight;
    }
    public String printCar() {
        return "Название: " + name + "; Цвет: " + color + "; Вес: " + weight;

    }
}

