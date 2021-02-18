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
        float salar, venda;
        String nom;
        int falta;
        
        salar = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o seu salário: "));
        venda = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a suas vendas: "));
        nom = JOptionPane.showInputDialog(null, "Digite seu nome: ");
        falta = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade de falta: "));
        
        Vendedor v = new Vendedor(venda, salar, nom, falta);
        //Metodos chamados
        v.imprimiDados();
        v.setFalta(falta);
        v.setNome(nom);
        v.setSalario(salar);
        v.setVendas(venda);
        v.calcularComissao();
        v.descontoFalta();
        v.calcularSalario();
        v.imprimiDados();
        
        
        
    }
}
