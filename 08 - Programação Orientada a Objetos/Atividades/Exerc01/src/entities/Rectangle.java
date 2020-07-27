package entities;

public class Rectangle {
    //ATRIBUTOS
    public double width;
    public double height;

    //METODOS
    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public double diagonal() {
        return Math.sqrt(width * width + height * height);
    }
}
