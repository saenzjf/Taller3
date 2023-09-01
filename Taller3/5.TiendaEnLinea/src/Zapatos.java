public class Zapatos extends pRopa{
    
    double precioNeto = 300000;
    double precioFinal;
    int stock = 200;
    
    public Zapatos(int numeroDeSerie, double talla) {
        super(numeroDeSerie, talla);
        
    }
    
    @Override
    public double calcularPrecio() {
        precioFinal = precioNeto + (precioNeto * getIVA());
        return precioFinal;
    }
    @Override
    public String mostrarDetalles() {
        String detalles = "Color Cafe";
        return detalles;
    }
    @Override
    public boolean comprar() {
        if(stock > 0){
            stock = stock -1;
            return true;
           }else{
            System.out.println("Producto agotado.");
            return false;
           }
    }
    @Override
    public int getStock() {
        return stock;
    }

    public double getPrecioNeto() {
        return precioNeto;
    }

    public double getTalla() {
        return talla;
    }


}
