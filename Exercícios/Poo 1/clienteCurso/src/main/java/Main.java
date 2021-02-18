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
    public static void main(String [] args) {
        Cliente p = new Cliente();
        p.nome = "Lucas";
        p.sobreNome = "Duarte";
        p.email = "lkgg-962@hotmail.com";      
        p.cep = 1814090;

        System.out.println("Nome: " + p.nome + "\nSobrenome: " + p.sobreNome + "\nEmail: " + p.email + "\nCEP: " + p.cep);

        Curso c = new Curso();
        c.nomeDoCurso = "Analise e Desenvolvimento de Sistemas";
        c.periodo = "Manhã";
        c.rgm = 22618333;

        System.out.println("Nome do curso: " + c.nomeDoCurso + "\nPeriodo: " + c.periodo + "\nRGM: " + c.rgm);
    }
}
