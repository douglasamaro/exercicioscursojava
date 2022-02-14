package Parte1.BancoCad;

import Parte1.BancoCad.data.Dados;

import java.util.Scanner;

public class MainExe {

    public static void main(String[] args) {

        double taxa = -5;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o nome do titular da conta: ");
        String name = ler.nextLine();
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Olá, " + name + ", Precisamos que digite 4 dígitos para ser o numero de sua conta: ");
        int numeroConta = ler.nextInt();
        System.out.println("---------------------------------------------------------------------------------");
        String conta1 = Integer.toString(numeroConta);
        while ((conta1.length() != 4)) {
            System.out.println("Precisamos que digite 4 numeros para a aprovaçao: ");
            numeroConta = ler.nextInt();
            conta1 = Integer.toString(numeroConta);
            System.out.println("---------------------------------------------------------------------------------");
        }

        System.out.println("Deseja fazer algum deposito (s/n)? ");
        ler.nextLine();
        String resposta = ler.nextLine();
        if (resposta.toUpperCase().equals("S")) {
            System.out.println("digite o valor do deposito: R$");
            double deposito  = ler.nextDouble();

            Dados dados = new Dados(numeroConta, name, deposito);
        } else {
            Dados dados = new Dados(numeroConta, name);
        }

        System.out.println(Dados.dadosConta());
        System.out.println("---------------------------------------------------------------------------------");
        System.out.print("Coloque um valor para depósito: R$");
        double deposito = ler.nextDouble();
        Dados.setSaldo(deposito);
        System.out.println("Updated data");
        System.out.println(Dados.dadosConta());
        System.out.println("---------------------------------------------------------------------------------");
        System.out.print("Coloque um valor para saque: R$-");
        deposito = ler.nextDouble();
        Dados.setSaldo(-deposito + (taxa));
        System.out.println("Updated data");
        System.out.println(Dados.dadosConta());

    }
}
