package HOMEWORK2;

public class CalculatorTest {
    public static void main(String[] args) {
        long a = 3;
        long b = 5000000L;
        Calculator.sub(a,b);
        Calculator.mult(a,b);
        Calculator.div(b,a);

        int c = 3;
        double d = 5.5;
        Calculator.sub(c,d);
        Calculator.mult(c,d);
        Calculator.div(c,d);

        long e = 300000000000000000L;
        double f = 5.5;
        Calculator.sub(e,f);
        Calculator.mult(e,f);
        Calculator.div(e,f);

        int g = 300000000;
        int h = 67;
        Calculator.sub(g,h);
        Calculator.mult(g,h);
        Calculator.div(g,h);
    }
}
