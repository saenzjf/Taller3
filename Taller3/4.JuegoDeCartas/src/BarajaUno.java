import java.util.ArrayList;
import java.util.List;

public class BarajaUno {
    private List<ArrayList<CartaUno>> baraja112;
    
    private ArrayList<CartaUno> rojo = new ArrayList<>();
    private ArrayList<CartaUno> azul = new ArrayList<>();
    private ArrayList<CartaUno> verde = new ArrayList<>();
    private ArrayList<CartaUno> amarillo = new ArrayList<>();

    /*Encontrarás 25 cartas de cada color (rojo, verde, azul y amarillo) 
    ocho cartas de Comodín, tres cartas para personalizar 
    y una carta de Regla Especial en el interior de la baraja de 112 cartas.*/

    public BarajaUno(){
        baraja112 = new ArrayList<>();
        crear();

    }

    public void crear(){
        baraja112.add(rojo);
        baraja112.add(azul);
        baraja112.add(verde);
        baraja112.add(amarillo);

        for(int i = 0; i < baraja112.size(); i++) {
            for(int j = 0; j < 18; j++) {
                CartaUno cartaNueva = new CartaUno(i,j);
                baraja112.get(i).add(j, cartaNueva);
            }
        }
    }

    public List<ArrayList<CartaUno>> getBarajaCreadaUno(){
        return baraja112;
    }
    
}
