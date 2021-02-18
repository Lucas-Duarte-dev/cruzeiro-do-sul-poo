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
        double bas, altu;
        bas = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da base: "));
        altu = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor da altura: "));
        
        Triangulo t = new Triangulo(bas, altu);
        
        t.setAltura(altu);
        t.setBase(bas);
        t.imprimeDados();
    }
}
