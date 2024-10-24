package Task4;

public class Square implements Shape {
    double længde;
    Square(double længde){
    this.længde = længde;
    }
    public double getArea(){
        return længde*længde;
    }
}
