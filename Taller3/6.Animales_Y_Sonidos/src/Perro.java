public class Perro extends Mamifero{

    String sonido = "Guau";
    public Perro(String nombre) {
        super(nombre);

    }

    @Override
    public String hacerSonido() {
        return sonido;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
    
}
