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

public class Vendedor {
    private float vendas;
    private float salario;
    private String nome;
    private int falta;
    
    Vendedor(){}
    Vendedor(float vendas, float salario, String nome, int falta){
        this.vendas = vendas;
        this.salario = salario;
        this.nome = nome;
        this.falta = falta;
    }
    
    public void setVendas(float v) {
        vendas = v;
    }
    public float getVendas(){
        return vendas;
    }
    
    public void setSalario(float s){
        salario = s;
    }
    public float getSalario(){
        return salario;
    }
    
    public void setNome(String n){
        nome = n;
    }
    public String getNome(){
        return nome;
    }
    
    public void setFalta(int f){
        falta = f;
    }
    public int getFalta(){
        return falta;
    }
    void imprimiDados(){
        JOptionPane.showMessageDialog(null, "Vendas: " + vendas 
                + "\nSalário: " + salario 
                + "\nNome: " + nome 
                + "\nFalta: " + falta
        );
    }
    
    void calcularSalario(){
        salario = (salario + calcularComissao() - descontoFalta());
        
    }
    
    Float calcularComissao() { 
        float comissao;
        if(vendas >= 1000 && vendas < 2000) {
          comissao = (vendas * 0.10f);
        }
        else{
            comissao =  (vendas  * 0.15f);
        }
        return comissao;
    }
    float descontoFalta(){
        float desconto = (salario/30)*falta;
        
        return desconto;
    }
    
    
}   



