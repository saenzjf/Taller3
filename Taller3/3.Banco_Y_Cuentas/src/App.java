import java.util.Scanner;

public class App { 
    public static void main(String[] args) throws Exception {
        
        int opcion;
        int numeroCuenta;

        System.out.println(">>BIENVENIDO<<");
        System.out.println("1. Cuenta Ahorros.");
        System.out.println("2. Cuenta Corriente.");
        Scanner entrada = new Scanner(System.in);
        opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el numero de cuenta: ");
                numeroCuenta = entrada.nextInt();
                CuentaAhorros cuentaA = new CuentaAhorros(numeroCuenta, 1000, 0.05);
                cuentaA.iniciar();
                break;
        
            case 2:
                System.out.print("Ingrese el numero de cuenta: ");
                numeroCuenta = entrada.nextInt();
                CuentaCorriente cuentaC = new CuentaCorriente(numeroCuenta, 1500, 500);
                cuentaC.iniciar();
                break;

            default:
                System.out.println("Opcion invalida.");
                break;
        }
    }
}
