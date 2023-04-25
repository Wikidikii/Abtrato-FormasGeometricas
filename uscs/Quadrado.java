/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uscs;

/**
 *
 * @author kawe.silva_uscsonlin
 */
public class Quadrado implements FormaGeometrica {
    private double lado;
    
    public double getLado() {
        return lado;
    }
    
    public Quadrado (double l) {
    this.lado = l;
}
    @Override
    public double área() {
        return this.lado*this.lado;
       
    }

    @Override
    public double perimetro() {
        return this.lado*4;
    }
    
}
