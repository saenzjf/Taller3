package figurasV2;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Figuras V2.0");

        FiguraGeometrica circulo = new Circulo(10);
        FiguraGeometrica triangulo = new Triangulo(4,  3, 5, 4, 3);
        FiguraGeometrica cuadrado = new Cuadrado(8);

        ArrayList<FiguraGeometrica> arreglo = new ArrayList<>();
        arreglo.add(circulo);
        arreglo.add(triangulo);
        arreglo.add(cuadrado);

        for (int i = 0; i < arreglo.size(); i++) {
            double recorrido = arreglo.get(i).calcularArea();
            System.out.println(recorrido);
        }
    }
}
