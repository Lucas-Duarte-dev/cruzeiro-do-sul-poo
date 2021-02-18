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
        
    String carg;
    int temp, crach;
    float  salar, porcen;
    
    carg = JOptionPane.showInputDialog(null, "Digite o seu cargo: ");
    crach = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero do seu cracha: "));
    salar = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor do seu salário: "));
    temp = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantos anos você está na empresa"));
    porcen = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a porcentagem de aumento: "));
    
    Funcionario f = new Funcionario(crach, salar, carg);
    f.imprimiDados();
    f.calculaAumento(porcen);
    f.calculaAumento(temp);
    f.imprimiDados();
    
    }
}
