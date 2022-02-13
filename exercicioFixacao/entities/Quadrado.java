package Parte1.exercicioFixacao.entities;

public class Quadrado {

    public double width;
    public double height;
    public double diagonal;

    public double Area() {
       return width * height;
    }

    public double Perimeter() {
        return (width * 2) + (height * 2);
    }

    public double Diagonal() {
        diagonal  = (width * width) + (height * height);
        return java.lang.Math.sqrt(diagonal);
    }

}
