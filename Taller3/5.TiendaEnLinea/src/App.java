public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(">>TIENDA<<");

        Zapatos zapatosSaliente = new Zapatos(4564, 38);
        
        PS5 PS5Saliente = new PS5(56482);

        System.out.println("\nPS5");
        System.out.println("El precio sin Iva del PS5 es: "+PS5Saliente.getPrecioNeto());
        System.out.println("El precio final es: "+PS5Saliente.calcularPrecio());

        System.out.println("\nZapatos");
        System.out.println("Stock antes: "+zapatosSaliente.getStock());
        System.out.println(zapatosSaliente.comprar());
        System.out.println("Stock despues: "+zapatosSaliente.getStock());
       
 
        System.out.println("\nDiccionario");
        Diccionario LibSaliente = new Diccionario(4845484, "Dura");
        System.out.println("Detalle: | "+ LibSaliente.mostrarDetalles());
    
        

    }
}
