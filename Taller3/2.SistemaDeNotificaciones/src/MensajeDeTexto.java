import java.util.Scanner;

public class MensajeDeTexto extends NotificacionPush {
    
    String contenido;

    public MensajeDeTexto(){
        iniciar();
    }

    public void iniciar(){
        System.out.println("Ingrese contenido del mensaje de texto: ");
        Scanner entrada = new Scanner(System.in);
        contenido = entrada.nextLine();
        enviar();
    }

    public void enviar(){
        sonido();
        vibracion();
        System.out.println(contenido);
    }
}
