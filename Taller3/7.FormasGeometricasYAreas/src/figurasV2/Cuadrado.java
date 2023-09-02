package figurasV2;

public class Cuadrado extends Figura{

    private double lado;
    
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return lado*lado;
    }

    public double calcularPerimetro(){
        return lado*4;
    }
}
