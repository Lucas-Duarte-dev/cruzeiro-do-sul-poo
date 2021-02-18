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

public class Triangulo {
    private double base;
    private double altura;
    
    Triangulo(){}
    
    Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    public double getBase(){
        return base;
    }
    public void setBase(double b){
        base = b;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double a) {
        altura = a;
    }
    double calcularArea() {
        double area = base * altura / 2;
        
        return area;
    }
    void imprimeDados() {
        JOptionPane.showMessageDialog(null,"Base:" + base + "\nAltura" + altura + "\nArea: " + calcularArea());
    }
    
}
