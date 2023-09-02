public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(">>INSTRUMENTOS<<");

        Instrumento[] orquesta = new Instrumento[3];
        orquesta[0] = new Guitarra();
        orquesta[1] = new Piano();
        orquesta[2] = new Violin();

        Orquesta orq = new Orquesta();
        orq.hacerSonarOrquetas(orquesta);
    }
}
