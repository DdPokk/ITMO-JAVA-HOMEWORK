package HOMEWORK3.part3;
import java.util.Calendar;

public class House {
    private int floors;
    private int years;
    private String name;

    public House() {
    }
    void setHouse(int number, int year, String name) {
        floors = number;
        years = year;
        this.name = name;
    }
    public String getHouse() {
        return "Этажей- " + floors + "; Год- " + years + "; Название- " + name;
    }
    public int getYears(){
        Calendar calendar = Calendar.getInstance();
        return  calendar.get(Calendar.YEAR) - years;
    }
}
