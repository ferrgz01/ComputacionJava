import static java.lang.Math.pow;

public class Circle implements Shape {

    public static final double pi=3.1415;
    private double radio;

    public Circle(double radio){
        this.radio=radio;
    }

    public double getRadio(double radio) {
       return radio;
    }

    public double getArea() {
        return pi*pow(radio,2);
    }

    public double getPerimeter() {
        return pi*(radio*2);
    }


}
