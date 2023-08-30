import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int opcion;
        Scanner entrada = new Scanner(System.in);
        System.out.println(">>BIENVENIDO<<");
        System.out.println("¿En que servicio va a enviar la notificacion?");

        System.out.println("1. Correo Electronico");
        System.out.println("2. Mensaje de texto");
        System.out.println("3. Mensaje instantaneo");
        opcion = entrada.nextInt();


        switch (opcion) {
            case 1:
                CorreoElectronico correoNuevo = new CorreoElectronico();
                //correoNuevo.iniciar();
                break;
            
            case 2:
                MensajeDeTexto mensajeNuevo = new MensajeDeTexto();
                //mensajeNuevo.iniciar();

                break;

            case 3:
                MensajeriaInstantanea mensajeINuevo = new MensajeriaInstantanea();
                //mensajeINuevo.iniciar();
                break;
        
        
            default:
                System.out.println("Opción invalida");
                break;
        }
    }
}
