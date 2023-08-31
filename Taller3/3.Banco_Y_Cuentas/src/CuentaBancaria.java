public interface CuentaBancaria {
    
    void depositar(double cantidad);
    boolean retirar(double cantidad);
    double getSaldo();
    int getNumeroCuenta();
}
