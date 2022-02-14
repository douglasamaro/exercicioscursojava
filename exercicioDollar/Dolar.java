package Parte1.exercicioDollar;

import Parte1.exercicioDollar.util.Calculator;

import java.util.Scanner;

public class Dolar {

     static Scanner ler = new Scanner(System.in);

     public static void main(String[] args) {

         Calculator calc = new Calculator();
         System.out.print("insira o valor do dolar: ");
         calc.dolar = ler.nextDouble();
         System.out.println("");
         System.out.print("quantos dolares comprou? : ");
         calc.comprado = ler.nextDouble();
         System.out.println("");
         System.out.printf("Você deverá pagar: %.2f", calc.Calcular());

     }
}
