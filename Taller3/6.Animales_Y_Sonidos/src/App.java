import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        Perro perroNuevo = new Perro("Milo");
        Gato gatoNuevo = new Gato("Silvestre");
        Canario canarioNuevo = new Canario("Piolin");
        
        System.out.println(">>SONIDOS DE ANIMALES<<");

        ArrayList<Animal> sonido = new ArrayList<>();
        sonido.add(perroNuevo);
        sonido.add(gatoNuevo);
        sonido.add(canarioNuevo);
        
        for (int i = 0; i < sonido.size(); i++){
            String recorrido = sonido.get(i).hacerSonido();
            System.out.println(recorrido);
        }

    }
}
