public abstract class CartaBase implements Carta{
    protected int palo;
    protected int valor;
    
    public CartaBase(int palo, int valor) {
        this.palo = palo;
        this.valor = valor;
    }

    public void mezclar(){
        //Mezclar
    }
}
