/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lkgg-
 */
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        String nom;
        int id; 
        
        nom = JOptionPane.showInputDialog(null, "Digite seu nome: ");
        id = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idade: "));
        
        Torneio t = new Torneio(nom, id);
        

        t.setIdade(id);
        t.setNome(nom);
        t.verificarCategoria();
        t.imprimeDados();
    }
}
