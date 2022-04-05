package HOMEWORK2;

//чехлы для телефона
public class Case {
    double side1;
    double side2;
    double height;
    String color;

    public Case (double s1, double s2, double h, String c)
    {
        side1 = s1;
        side2 = s2;
        height = h;
        color = c;
    }
    public double square(){return side1 * side2;}
    public double sidesSum(){return height*4 + side1*8 + side2*8;}
    String color(){
        return color;
    }
}