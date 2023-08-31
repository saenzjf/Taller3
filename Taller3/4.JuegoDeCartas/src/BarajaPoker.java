import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BarajaPoker {
    
    private List<ArrayList<CartaPoker>> baraja52;

    private ArrayList<CartaPoker> corazon = new ArrayList<>();
    private ArrayList<CartaPoker> diamante = new ArrayList<>();
    private ArrayList<CartaPoker> trebol = new ArrayList<>();
    private ArrayList<CartaPoker> picas = new ArrayList<>();


    public BarajaPoker(){
        baraja52 = new ArrayList<>();
        crear();

    }

    public void crear(){
        baraja52.add(corazon);
        baraja52.add(diamante);
        baraja52.add(trebol);
        baraja52.add(picas);

        for(int i = 0; i < baraja52.size(); i++) {
            for(int j = 0; j < 13; j++) {
                CartaPoker cartaNueva = new CartaPoker(i,j);
                baraja52.get(i).add(j, cartaNueva);
            }
        }
    }

    public List<ArrayList<CartaPoker>> getBarajaCreada(){
        return baraja52;
    }

    
/* 
    public void repartirMano(){
        
        for (int i = 0; i <5; i++){
            
            repartirUnaCarta();
            if (indiceBaraja == 1) {
                System.out.println(cartaAleatoria+" de Corazones");
            } 
            else if (indiceBaraja == 2) {
                System.out.println(cartaAleatoria+" de Diamantes");
            }
            else if (indiceBaraja == 3) {
                System.out.println(cartaAleatoria+" de Trebol");
            }
            else if (indiceBaraja == 4) {
                System.out.println(cartaAleatoria+" de Picas");
            }
        }
    } */



}
