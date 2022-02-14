package Parte1.BancoCad.data;

public class Dados {

    private static int numeroConta;
    private static String name;
    private static double saldo;
    public static String status;


    public Dados() {
    }

    public Dados(int numeroConta, String name, double saldo) {
        this.numeroConta = numeroConta;
        this.name = name;
        this.saldo += saldo;
    }

    public Dados(int numeroConta, String name) {
        this.numeroConta = numeroConta;
        this.name = name;
    }

    public static void setSaldo(double deposito) {
        saldo += deposito;
    }


    public static String Saldo() {
       if (saldo >= 0) {
           status = " + Saldo positivo ";
       } else {
           status = " - Saldo negativo ";
       }
       return status;
    }




    public static String dadosConta() {
        String msg = "Numero da conta: " + numeroConta + " | Titular: " + name + "| Saldo: R$" + saldo + " " + Saldo();
        return msg;
    }

}
