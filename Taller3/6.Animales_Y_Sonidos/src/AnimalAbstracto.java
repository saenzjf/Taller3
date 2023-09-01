public abstract class AnimalAbstracto implements Animal{
    protected String nombre;
    
    public AnimalAbstracto(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
}
