package exercicio;

import java.util.Scanner;

public class FuncoesJava {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c =sc.nextInt();

        int hiegher = max(a, b, c);
        showResult(hiegher);
        sc.close();
    }

    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z){
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }

        return aux;

    }

    public static void showResult (int value) {
        System.out.println("Hiegher = " + value);
    }
}
