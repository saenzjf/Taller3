public class Gato extends Mamifero{
    
    String sonido = "Miau";
    public Gato (String nombre) {
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
