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
       

public class Torneio {
    private String nome;
    private int idade;
    Torneio(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome() {
        return nome;    
    }
    public int getIdade() {
        return idade;
    }
    public void setNome(String n) {
        nome = n;
    }
    public void setIdade(int i){
        idade = i;
    }
    String verificarCategoria(){
        String categoria;
        
        if(idade >= 5 && idade <= 7){
            categoria = "infantil";
           
        }
        else {
            if(idade >= 8 && idade <=10) {
                categoria = "Juvenil";
                
            }
            else{
                if(idade >= 11 && idade <= 15) {
                    categoria = "Adolescente";
                    
                }
                else{
                    if(idade >= 16 && idade <= 30) {
                        categoria = "Adulta";
                       
                    }
                    else{
                        categoria = "Senior";
                        
                    }
                }
            }
        }
        
       return categoria;
    }
    void imprimeDados() {
        JOptionPane.showMessageDialog(null, "Nome: " + nome 
        + "\nIdade: " + idade
        + "\nCategoria: " + verificarCategoria()
        );
        
    }
}
