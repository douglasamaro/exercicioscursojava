package Parte1.exercicioFixacao;

import Parte1.exercicioFixacao.entities.Quadrado;

import java.util.Scanner;

public class Exercicio1 {

public static void main(String[] args) {

    Quadrado quadrado = new Quadrado();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter rectangle width, click the button ENTER, and enter rectangle height");
    quadrado.width = sc.nextDouble();
    quadrado.height = sc.nextDouble();

    System.out.printf("AREA = %.2f", quadrado.Area());
    System.out.println("");
    System.out.printf("PERIMETER = %.2f", quadrado.Perimeter());
    System.out.println("");
    System.out.printf("DIAGONAL = %.2f", quadrado.Diagonal());
    System.out.println("");

    sc.close();
    }

}
