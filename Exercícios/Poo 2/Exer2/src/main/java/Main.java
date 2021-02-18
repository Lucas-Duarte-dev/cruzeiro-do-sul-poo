/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String args []) {
       Produto p1 = new Produto("Hyper X", "Hyper X", "7548125", 222.9f);
       Produto p2 = new Produto( );
       p2.marca = "Razer";
       p2.fabricante = "Razer";
       p2.codBarras = "312";
       p2.preco = 1233;
       
           
      
       System.out.println("Marca: " + p1.marca + "\nFabricante: " + p1.fabricante + "\nCódigo de Barras: " + p1.codBarras + "\nPreço: " + p1.preco);
       
       System.out.println("Marca: " + p2.marca + "\nFabricante: " + p2.fabricante + "\nCódigo de Barras: " + p2.codBarras + "\nPreço: " + p2.preco);
        }
}
