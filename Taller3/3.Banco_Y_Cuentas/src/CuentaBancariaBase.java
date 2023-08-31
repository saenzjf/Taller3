import java.util.Scanner;

public abstract class CuentaBancariaBase implements CuentaBancaria{

    protected  int numeroCuenta;
    protected  double saldo;

    public CuentaBancariaBase(int numeroCuenta, double saldoInicial){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }
    

    public void depositar(double cantidad){
        if(cantidad > 0){
            saldo = saldo + cantidad;
        }
    }

    public boolean retirar(double cantidad){
        
        if(cantidad > 0 && saldo >= cantidad){
            saldo = saldo - cantidad;
            return true;
        }
        return false;
    }

    public double getSaldo(){
        return saldo;
    }

    public int getNumeroCuenta(){
        return numeroCuenta;
    }

    
}
