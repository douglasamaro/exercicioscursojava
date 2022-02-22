package exercicio.exercicioDollar.util;

public class Calculator {

    public double dolar;
    public double comprado;

    public double Calcular() {
        return (((dolar * comprado) / 100) * 6) + (dolar * comprado) ;
    }

}
