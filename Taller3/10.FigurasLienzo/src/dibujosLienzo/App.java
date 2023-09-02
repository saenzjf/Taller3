package dibujosLienzo;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Figuras");

        Figura circulo = new Circulo();
        Figura rectangulo = new Rectangulo();
        Figura triangulo = new Triangulo();

        // Crear un arreglo de objetos Dibujable
        Dibujable[] dibujables = {circulo, rectangulo, triangulo};

        // Crear un lienzo y dibujar todo
        Lienzo lienzo = new Lienzo(dibujables);
        lienzo.dibujarTodo();
    }
}
