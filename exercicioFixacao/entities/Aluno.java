package Parte1.exercicioFixacao.entities;


public class Aluno {

   public String name;
   public double nota1;
   public double nota2;
   public double nota3;
   public double resultado;
   public double miss;

   public double FinalGrade() {
       resultado = nota1 + nota2 + nota3;
       return resultado;
   }

   public String Result() {
       if (resultado >= 60) {
           return "PASS";
        } else {
           miss = 100 - resultado;
           return "FAILED \n" + "MISSING " + miss + " POINTS";
       }
   }

}
