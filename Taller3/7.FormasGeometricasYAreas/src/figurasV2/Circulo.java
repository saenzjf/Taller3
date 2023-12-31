package figurasV2;

public class Circulo extends Figura{
    
    private double radio; 

    public Circulo(double radio){
        this.radio = radio;
    }

    @Override
    public double calcularArea(){
        return Math.PI * radio * radio;
    }

    public double calcularPerimetro(){
        return 2*Math.PI * radio;
    }

}
