/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC
 */
public class Produto {
    String marca;
    String fabricante;
    String codBarras;
    float preco;

    Produto() {}

    Produto(String marca, String fabricante, String codBarras, float preco) {
        this.marca = marca;
        this.fabricante = fabricante;
        this.codBarras = codBarras;
        this.preco = preco;
    }
}
