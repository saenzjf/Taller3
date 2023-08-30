import java.util.Scanner;

public class CorreoElectronico extends NotificacionPush{
    
    String contenido;

    public CorreoElectronico(){
        iniciar();
    }

    public void iniciar(){
        System.out.println("Ingrese contenido del correo: ");
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
