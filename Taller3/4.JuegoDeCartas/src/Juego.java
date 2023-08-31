import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Juego {
    private List<ArrayList<CartaPoker>> barajaLista;
    private List<ArrayList<CartaUno>> barajaListaUno;

    public Juego(){
    }

    public void iniciar(){
        int opcion;
        Scanner entrada  = new Scanner(System.in);

        System.out.println("Escoja el juego: ");
        System.out.println("1. Poker");
        System.out.println("2. UNO");
        opcion = entrada.nextInt();
        
        if (opcion == 1) {
            crearBaraja();
            repartirUnaCarta();
        } 
        else if (opcion == 2){
            crearBarajaUno();
            repartirUnaCartaUno();
        }else{
            System.out.println("Opcion invalida.");
        }


    }

    public void crearBaraja(){
        BarajaPoker barajaNueva = new BarajaPoker();
        barajaLista = barajaNueva.getBarajaCreada();
        
    }

    public void crearBarajaUno(){
        BarajaUno barajaNuevaUno = new BarajaUno();
        barajaListaUno = barajaNuevaUno.getBarajaCreadaUno();
        
    }

    public void repartirUnaCarta(){
        Random random = new Random();

        //int indiceBaraja;
        int indiceCarta;
        CartaPoker cartaAleatoria;

        for (int i = 0; i < 4; i++) {
            int indiceBaraja = random.nextInt(barajaLista.size());
            ArrayList<CartaPoker> paloAleatorio = barajaLista.get(indiceBaraja);

            indiceCarta = random.nextInt(paloAleatorio.size());
            cartaAleatoria = paloAleatorio.get(indiceCarta);

            cartaAleatoria.mostrarCarta();
            //Garantiza que no salga la misma carta.
            barajaLista.get(indiceBaraja).remove(indiceCarta); 
        }
        
        
    }

    public void repartirUnaCartaUno(){
        Random random = new Random();

        //int indiceBaraja;
        int indiceCarta;
        CartaUno cartaAleatoria;

        for (int i = 0; i < 4; i++) {
            int indiceBaraja = random.nextInt(barajaListaUno.size());
            ArrayList<CartaUno> paloAleatorio = barajaListaUno.get(indiceBaraja);

            indiceCarta = random.nextInt(paloAleatorio.size());
            cartaAleatoria = paloAleatorio.get(indiceCarta);

            cartaAleatoria.mostrarCarta();
            //Garantiza que no salga la misma carta.
            barajaListaUno.get(indiceBaraja).remove(indiceCarta); 
        }
        
        
    }

}
