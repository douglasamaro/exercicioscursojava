package exercicio;

import java.util.Scanner;

public class ExercicioAula30 {

    public static void main(String[] args) {

        //exe 1
        Scanner exe1 = new Scanner(System.in);
        double ex1num1 = exe1.nextDouble();
        double ex1num2 = exe1.nextDouble();

        double somaex1 = ex1num1 + ex1num2;
        System.out.println("Soma = " + somaex1);

        ////////////////////////////////////////
        //exe 2
        Scanner exe2 = new Scanner(System.in);
        double ex2num1 = exe2.nextDouble();
        double raio = 3.14159;

        double area = ex2num1 * ex2num1;
        double somaexe2 = area * raio;

        System.out.printf("Raio = %.4f%n", somaexe2);

        //////////////////////////////////////////////////
        //exe3
        Scanner exe3 = new Scanner(System.in);
        int A = exe3.nextInt();
        int B = exe3.nextInt();
        int C = exe3.nextInt();
        int D = exe3.nextInt();

        int diferenca = (A * B - C * D);
        System.out.println("DIFERNÇA = " + diferenca);

        ////////////////////////////////////////
        //exe4
        Scanner exe4 = new Scanner(System.in);
        int numero = exe4.nextInt();
        double horasTrabalhadas = exe4.nextDouble();
        double valorHora = exe4.nextDouble();

        double salary = horasTrabalhadas * valorHora;
        System.out.println("NUMERO = " + numero);
        System.out.println("SALARY = R$" + salary);

        ////////////////////////////////////////
        //exe5
        Scanner exe5 = new Scanner(System.in);
        Double num1, cod1, preco1 = exe5.nextDouble();
        Double num2, cod2, preco2 = exe5.nextDouble();

        Double pagar = preco1 + preco2;
        System.out.println("VALOR A PAGAR = R$" + pagar);

        //////////////////////////////
        //exe6
        Scanner exe6 = new Scanner(System.in);
        double A6 = 0, B6 = 0, C6 = exe6.nextDouble();

        double area6 = A6 * B6;
        double circula6 = C6 * 3.14159;
        double trapezio6 = (A6 * B6) * C6;
        double quadrado = B6 * B6;



        // fechamento
        exe1.close();
        exe2.close();
        exe3.close();
        exe4.close();
        exe5.close();
        exe6.close();


    }

}
