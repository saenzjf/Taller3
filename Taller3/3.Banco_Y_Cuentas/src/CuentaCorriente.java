import java.util.Scanner;

public class CuentaCorriente extends CuentaBancariaBase {
    
    private double limiteCredito;

    public CuentaCorriente(int numeroCuenta, double saldoInicial, double limiteCredito){
        super(numeroCuenta, saldoInicial);
        this.limiteCredito = limiteCredito;
    }

    public boolean retirar(double cantidad) {
        if (cantidad > 0 && saldo + limiteCredito >= cantidad) {
            saldo = saldo - cantidad;
            return true;
        }
        return false;
    }

    public void iniciar(){
          
        System.out.println("¿Que desea hacer?");
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Depositar.");
        System.out.println("2. Retirar");
        int operacion = scanner.nextInt();
        int cantidad;

        switch (operacion) {
            case 1:
                System.out.println("Ingrese la cantidad:");
                cantidad = scanner.nextInt();
                depositar(cantidad);
                System.out.println("El nuevo saldo es: "+getSaldo()); 
                break;
            
            case 2:
                System.out.println("Ingrese la cantidad:");
                cantidad = scanner.nextInt();
                retirar(cantidad);
                System.out.println("El nuevo saldo es: "+getSaldo()); 
                break;

            default:
                System.out.println("Opcion invalida.");
                break;
        }
    }
}
