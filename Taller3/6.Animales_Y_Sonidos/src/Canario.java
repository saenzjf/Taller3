public class Canario extends Oviparo{

    String sonido = "FiuFiu";
    public Canario(String nombre) {
        super(nombre);
    }

    @Override
    public String hacerSonido() {
       return sonido;
    }
    
}
