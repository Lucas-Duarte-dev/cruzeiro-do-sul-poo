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

public class Funcionario {
    private int cracha;
    private float salario;
    private String cargo;
    
    Funcionario(){}
    
    Funcionario(int cracha, float salario, String cargo){
        this.cracha = cracha;
        this.salario = salario;
        this.cargo = cargo;
    }
    
    void imprimiDados(){
        JOptionPane.showMessageDialog(null, "Cracha: " + cracha
        + "\nSalário: " + salario
        + "\nCargo: " + cargo);
    }
    Float calculaAumento(float porcentagem){
        salario = salario + (salario * (porcentagem /  100));
        return salario;
    }
    Float calculaAumento(int tempo){
        
        tempo = tempo * 150;
        salario = salario + tempo;
        
        return salario;
        
    }
}
