package exercicio;

import java.util.Scanner;

public class Exercicio37 {

    public static void main(String[] args) {


        //exercicio 1
        Scanner exe1 = new Scanner(System.in);
        Double num1 = exe1.nextDouble();

        if (num1 < 0) {
            System.out.println("O número " + num1 + " é NEGATIVO");
        }
        else {
            System.out.println("O número " + num1 + " é POSITIVO");
        }

        //exercicio 2
        Scanner exe2 = new Scanner(System.in);
        Double numpar = exe2.nextDouble();

        if (numpar % 2 == 0) {
            System.out.println("O número " + numpar + " é PAR");
        }
        else {
            System.out.println("O número " + numpar + " é IMPAR");
        }





        exe1.close();
        exe2.close();

    }

}
