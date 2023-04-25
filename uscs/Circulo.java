
package uscs;


public class Circulo implements FormaGeometrica {
    private final double raio;
    
    public double getRaio() {
        return raio;
    }
    
    public Circulo (double r){
        this.raio = r;
    }

    @Override
    public double área() {

    return this.raio*this.raio*Math.PI;
    }

    @Override
    public double perimetro() {
        return 2*this.raio*Math.PI;
    }
    
}
