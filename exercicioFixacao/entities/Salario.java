package exercicio.exercicioFixacao.entities;


public class Salario {

    public String name;
    public double grossSalary;
    public double tax;
    public double percentage;
    public double grossSalaryt;

    public double NetSalary() {
        grossSalaryt = grossSalary - tax;
        return grossSalaryt;
    }

    public double IncreaseSalary() {
        grossSalaryt += ( grossSalary / 100) * percentage;
        return grossSalaryt;
    }

}
