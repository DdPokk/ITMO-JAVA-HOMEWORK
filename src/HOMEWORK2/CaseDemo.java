package HOMEWORK2;

class CaseDemo{
    public static void main(String[] args){
        Case newcase1 = new Case(5,10,1,"Black");
        Case newcase2 = new Case(7,21,2,"Red");

        double sq;
        double sides;

        sq = newcase1.square();
        sides = newcase1.SidesSum();
        System.out.println("Площадь поверхности чехла: " + sq + ", размер суммы сторон " + sides +
                " и цвет чехла "+ newcase1.color);

        sq = newcase2.square();
        sides = newcase2.SidesSum();
        System.out.println("Площадь поверхности чехла: " + sq + ", размер суммы сторон " + sides +
                " и цвет чехла "+ newcase2.color);
    }
}
