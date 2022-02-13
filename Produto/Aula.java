package Parte1.Produto;

import Parte1.Produto.entities.Product;

import java.util.Scanner;


public class Aula {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter data ");
        System.out.println("");

        //inputs
        System.out.print("Name: "); String name = sc.nextLine();
        System.out.print("Price: "); double price = sc.nextDouble();
        Product product = new Product(name, price);

        System.out.println(product);
        System.out.println("");

       //add
        System.out.print("Enter the number of products to be added from stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println("Update data " + product);
        System.out.println("");

         //remove
        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println("Update data " + product);
        System.out.println("");

    }

}
