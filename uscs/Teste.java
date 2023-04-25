/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uscs;

/**
 *
 * @author kawe.silva_uscsonlin
 */
public class Teste {
       
    
    public static void main(String[] args) {
           Circulo Circulo1 = new Circulo (10);
           Quadrado Quadrado1 = new Quadrado (5);
           
           System.out.println("Raio:" + Circulo1.getRaio());
           System.out.println("Área do circulo:" + Circulo1.área());
           System.out.println("Perimetro do circulo:" +Circulo1.perimetro());
           
           System.out.println("Lado:" + Quadrado1.getLado());
           System.out.println("Área do quadrado:" +Quadrado1.área());
           System.out.println("Perimetro do quadrado:" +Quadrado1.perimetro());
    }
    
}
