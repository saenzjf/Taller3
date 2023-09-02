public abstract class EmpleadoAbstracto implements Empleado{
    String nombre;
    public EmpleadoAbstracto(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
