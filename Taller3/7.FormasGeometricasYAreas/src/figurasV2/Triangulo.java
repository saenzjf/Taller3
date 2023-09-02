package figurasV2;

public class Triangulo extends Figura{
    
    private double base;
    private double altura;
    private double lado1, lado2, lado3;

    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea(){
        return (base*altura)/2;
    }

    public double calcularPerimetro(){
        return lado1 + lado2 + lado3;
    }
}
