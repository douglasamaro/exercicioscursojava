package exercicio.exercicioFixacao;

import exercicio.exercicioFixacao.entities.Aluno;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student name ");
        aluno.name = sc.nextLine();
        System.out.println("Enter grade 1 ");
        aluno.nota1 = sc.nextDouble();
        System.out.println("Enter grade 2 ");
        aluno.nota2 = sc.nextDouble();
        System.out.println("Enter grade 3 ");
        aluno.nota3 = sc.nextDouble();

        System.out.println("Final Grade = " + aluno.FinalGrade());
        System.out.println(aluno.Result());

        sc.close();
    }

}
