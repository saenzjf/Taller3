import java.util.Scanner;

public class CuentaAhorros extends CuentaBancariaBase{
    
    private double tasaInteres;

    public CuentaAhorros(int numeroCuenta, double saldoInicial, double tasaInteres){
        super(numeroCuenta, saldoInicial);
        this.tasaInteres = tasaInteres;
    }

    public void calcularInteres(){
        double intereses = saldo*tasaInteres;
        saldo = saldo + intereses;
    }

    public void iniciar(){
          
        System.out.println("¿Que desea hacer?");
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Depositar.");
        System.out.println("2. Retirar");
        System.out.println("3. Calcular intereses.");
        System.out.println("4. Salir.");
        int operacion = scanner.nextInt();
        int cantidad;

        switch (operacion) {
            case 1:
                System.out.print("Ingrese la cantidad:");
                cantidad = scanner.nextInt();
                depositar(cantidad);
                System.out.println("El nuevo saldo es: "+getSaldo()); 
                iniciar();
                break;
            
            case 2:
                System.out.print("Ingrese la cantidad:");
                cantidad = scanner.nextInt();
                retirar(cantidad);
                System.out.println("El nuevo saldo es: "+getSaldo());
                iniciar(); 
                break;

            case 3:
                calcularInteres();
                System.out.println("El nuevo saldo es: "+getSaldo());
                iniciar();
                break;
            
            case 4:
                System.out.println("Vuelva pronto.");
                break;

            default:
                System.out.println("Opcion invalida.");
                break;
        }
    }
}
