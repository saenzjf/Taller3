public class CartaPoker extends CartaBase{

    public CartaPoker(int palo, int valor) {
        super(palo, valor);
    }


    @Override
    public void mostrarCarta(){
        
        switch (palo) {
            case 0:
                System.out.println(valor+" de  Corazones");
                break;
            case 1:
                System.out.println(valor+" de  Diamante");
                break;
            case 2:
                System.out.println(valor+" de  Treboles");
                break;
            case 3:
                System.out.println(valor+" de  Picas");
                break;
        
            default: 
                break;
        }
    }
    
    @Override
    public int getNumero() {
        return valor;
    }

}
