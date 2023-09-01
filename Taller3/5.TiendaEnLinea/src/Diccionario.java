public class Diccionario extends pLibro {

    private double precioNeto = 100000;
    private double precioFinal;
    private int stock = 75; 

    public Diccionario(int numeroDeSerie, String pasta) {
        super(numeroDeSerie, pasta);
    }

    @Override
    public double calcularPrecio() {
        precioFinal = precioNeto + (precioNeto * getIVA());
        return precioFinal;
    }

    @Override
    public String mostrarDetalles() {
        String detalles = "Version: bolsillo";
        return detalles;
    }

    @Override
    public boolean comprar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'comprar'");
    }

    @Override
    public int getStock() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStock'");
    }

    public double getPrecioNeto() {
        return precioNeto;
    }
    
}
