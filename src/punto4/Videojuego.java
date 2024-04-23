package punto4;
public class Videojuego{
    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compania;
    private static final int HORASESTIMADAS_DEFAULT=10;
    private static final boolean ENTREGADO_DEFAULT=false;
    public Videojuego(){
        horasEstimadas=HORASESTIMADAS_DEFAULT;
        entregado=ENTREGADO_DEFAULT;
        titulo=" ";
        genero=" ";
        compania=" ";
    }
    public Videojuego(String titulo,int horasEstimadas){
        entregado=ENTREGADO_DEFAULT;
        this.titulo=titulo;
        this.horasEstimadas=horasEstimadas;
        genero=" ";
        compania=" ";
    }
    public Videojuego(String titulo,int horasEstimadas,String genero,String compania){
        entregado=ENTREGADO_DEFAULT;
        this.titulo=titulo;
        this.horasEstimadas=horasEstimadas;
        this.genero=genero;
        this.compania=compania;
    }
    public void setTitulo(String titulo){this.titulo=titulo;}
    public void setHorasEstimadas(int horasEstimadas){this.horasEstimadas=horasEstimadas;}
    public void setGenero(String genero){this.genero=genero;}
    public void setCompania(String compania){this.compania=compania;}
    public String getTitulo(){return titulo;}
    public int getHorasEstimadas(){return horasEstimadas;}
    public String getGenero(){return genero;}
    public String getCompania(){return compania;}
    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
                '}';
    }
}
