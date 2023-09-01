public abstract class ProductoAbstracto implements Producto {
    
    private double IVA = 0.19;
    private int numeroDeSerie;
    protected double precioNeto;

    public ProductoAbstracto(int numeroDeSerie){
        this.numeroDeSerie = numeroDeSerie;
        //this.precioNeto = getPrecioNeto();
    }

    public int getNumeroDeSerie(){
        return numeroDeSerie;
    }

    public double getIVA(){
        return IVA;
    }

}
