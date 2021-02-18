/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
import javax.swing.JOptionPane;

public class Main {
    public static void main(String args[]) {
        Paciente p  =  new Paciente();
        Paciente p1 = new Paciente("Lucas");

        p.nome = JOptionPane.showInputDialog("Digite seu nome: ");
        p.rg = JOptionPane.showInputDialog("Digite seu RG: ");
        p.endereco = JOptionPane.showInputDialog("Digite o seu endereço: ");
        p.dataNascimento = JOptionPane.showInputDialog("Digite o sua data de nascimento: ");
        p.proficao = JOptionPane.showInputDialog("Digite o sua profissão: ");
        p.telefone = JOptionPane.showInputDialog("Digite o número do seu telefone: ");
        
        JOptionPane.showMessageDialog(null, "Nome: " + p.nome + "\nRG: " + p.rg + "\nData de nascimento: " + p.dataNascimento + "\nTelefone: " + p.telefone + "\nProfissão: " + p.proficao);

        System.out.println("Nome: " + p1.nome);
    }
}