public abstract class pLibro extends ProductoAbstracto{

    String pasta;
    public pLibro(int numeroDeSerie, String pasta) {
        super(numeroDeSerie);
        this.pasta = pasta;
        //TODO Auto-generated constructor stub
    }

    public String getPasta(){
        return pasta;
    }


    
}
