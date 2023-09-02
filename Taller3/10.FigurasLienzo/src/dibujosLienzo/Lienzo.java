package dibujosLienzo;

public class Lienzo {
    private Dibujable[] objetosDibujables;

    public Lienzo(Dibujable[] objetosDibujables) {
        this.objetosDibujables = objetosDibujables;
    }

    public void dibujarTodo() {
        for (Dibujable objeto : objetosDibujables) {
            objeto.dibujar();
        }
    } 
    public void dibujar() {
        System.out.println("Dibujando un Triangulo");
    }
}
