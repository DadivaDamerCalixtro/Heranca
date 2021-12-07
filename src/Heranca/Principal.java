/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heranca;

/**
 *
 * @author IFSC
 */
public class Principal {
    public static void main(String[] args) {
        Automovel carro = new Automovel();
        Automovel moto = new Automovel();
        
        carro.setNplaca("FRHBND45B");
        carro.setNportas(4);
        carro.setCor("Branco");
        carro.setNrodas(4);
        carro.setCpcdd(5);
        
        moto.setCor("Preto");
        moto.setCpcdd(2);
        moto.setNplaca("AEGVTLX28");
        moto.setNportas(0);
        moto.setNrodas(2);
    }
}
