public class CartaUno extends CartaBase {
    
    public CartaUno(int palo, int valor) {
        super(palo, valor);
    }

    @Override
    public void mostrarCarta(){
        
        switch (palo) {
            case 0:
                System.out.println(valor+" Rojo");
                break;
            case 1:
                System.out.println(valor+" Azul");
                break;
            case 2:
                System.out.println(valor+" Verde");
                break;
            case 3:
                System.out.println(valor+" Amarillo");
                break;
        
            default: 
                break;
        }
    }
    
    @Override
    public int getNumero() {
        // TODO Auto-generated method stub
        return valor;
    }
}
