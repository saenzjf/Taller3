public class TrabajadorPorHoras extends EmpleadoAbstracto{
    
    private int horasTrabajadas;
    private double tarifaPorHora;

    public TrabajadorPorHoras(String nombre, int horasTrabajadas, double tarifaPorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabajadas * tarifaPorHora;
    }
}

