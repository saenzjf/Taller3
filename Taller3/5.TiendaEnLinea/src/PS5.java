public class PS5 extends pElectronico{
    private double precioNeto = 2500000;
    private double precioFinal;
    private int stock = 500; 

    public PS5(int numeroDeSerie) {
        super(numeroDeSerie);
    }

    @Override
    public double calcularPrecio() {
        precioFinal = precioNeto + (precioNeto * getIVA());
        return precioFinal;
    }
    @Override
    public String mostrarDetalles() {
        String detalles = "Color Blanco, 2 Controles";
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

}
