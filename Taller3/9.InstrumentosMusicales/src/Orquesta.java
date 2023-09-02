public class Orquesta {
    
    public void hacerSonarOrquetas(Instrumento[] orquesta){
        
        for (Instrumento instrumento : orquesta) {
            instrumento.tocar();
        }
    }
}
