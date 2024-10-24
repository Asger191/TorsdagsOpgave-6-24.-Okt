package Task4;

public class Circle implements Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;

    }
    public double getArea(){

        return 3.14*(radius * radius);
    }
}
