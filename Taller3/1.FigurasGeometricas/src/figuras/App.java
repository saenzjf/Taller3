package figuras;
public class App {
    public static void main(String[] args) throws Exception {
        
        FiguraGeometrica circulo = new Circulo(10);
        FiguraGeometrica triangulo = new Triangulo(4,  3, 5, 4, 3);
        FiguraGeometrica cuadrado = new Cuadrado(8);

        System.out.println("CIRCULO.");
        System.out.println("El area es: "+circulo.calcularArea());
        System.out.println("El perimetro es: "+circulo.calcularPerimetro());

        System.out.println("TRIANGULO.");
        System.out.println("El area es: "+triangulo.calcularArea());
        System.out.println("El perimetro es: "+triangulo.calcularPerimetro());

        System.out.println("CUADRADO.");
        System.out.println("El area es: "+cuadrado.calcularArea());
        System.out.println("El perimetro es: "+cuadrado.calcularPerimetro());
    }
}