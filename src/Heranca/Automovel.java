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
public class Automovel extends Terrestre{
    private String cor;
    private String Nplaca;
    private int Nportas;
    
    public Automovel(){
        
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getNplaca() {
        return Nplaca;
    }
    public void setNplaca(String Nplaca) {
        this.Nplaca = Nplaca;
    }
    public int getNportas() {
        return Nportas;
    }
    public void setNportas(int Nportas) {
        this.Nportas = Nportas;
    }
    public void ImprimeDados(){
       System.out.print("---------------------------------");
       System.out.print("Numero da placa: "+Nplaca);
       System.out.print("Cor: "+cor);
       System.out.print("N° rodas: "+Nrodas);
       System.out.print("Capacidade: "+cpcdd);
       System.out.print("Quantidade de portas: "+Nportas);
    } 
}
