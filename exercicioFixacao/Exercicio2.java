package Parte1.exercicioFixacao;

import Parte1.exercicioFixacao.entities.Salario;

import java.util.Scanner;

public class Exercicio2 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Salario salario = new Salario();

            System.out.print("name ");
            salario.name = sc.nextLine();
            System.out.print("Gross Salary ");
            salario.grossSalary = sc.nextDouble();
            System.out.print("Tax ");
            salario.tax = sc.nextDouble();

            System.out.println("Employee: " + salario.name + ", $" + salario.NetSalary());

            System.out.println("Which percentage to increase salary? ");
            salario.percentage = sc.nextDouble();

            System.out.println("Update data: " + salario.name + ", $" + salario.IncreaseSalary());

        }



}
