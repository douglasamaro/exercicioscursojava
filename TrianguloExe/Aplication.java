package Parte1.TrianguloExe;

import Parte1.TrianguloExe.entities.Triangle;

import java.util.Scanner;

public class Aplication {

    public static void main(String[] args) {

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        Scanner sc = new Scanner(System.in);

        System.out.println("digite a medida dos três lados do triangulo X");
        System.out.println("lado 1");
        x.a = sc.nextDouble();
        System.out.println("lado 2");
        x.b = sc.nextDouble();
        System.out.println("lado 3");
        x.c = sc.nextDouble();

        System.out.println("digite a medida dos três lados do triangulo Y");
        System.out.println("lado 1");
        y.a = sc.nextDouble();
        System.out.println("lado 2");
        y.b = sc.nextDouble();
        System.out.println("lado 3");
        y.c = sc.nextDouble();


        double area1 = x.area();
        double area2  = y.area();



        System.out.printf("A area do triangulo Y = %.2f", area1);
        System.out.println(" ");
        System.out.printf("A area do triangulo Y = %.2f", area2);
        System.out.println(" ");
        if (area1 > area2) {
            System.out.println(" O triangulo X e maior que o triangulo Y");
        } else {
            System.out.println(" O triangulo Y e maior que o triangulo X");
        }

        sc.close();

    }

}
