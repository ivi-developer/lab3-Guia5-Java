package punto4;
public class Serie{
    private String titulo;
    private int temporadas;
    private String genero;
    private String creador;
    private boolean entregado;
    private static final int TEMPORADAS_DEFAULT=3;
    private static final boolean ENTREGADO_DEFAULT=false;
    public Serie(){
        temporadas=TEMPORADAS_DEFAULT;
        entregado=ENTREGADO_DEFAULT;
        titulo=" ";
        genero=" ";
        creador=" ";
    }
    public Serie(String titulo,String creador){
        temporadas=TEMPORADAS_DEFAULT;
        entregado=ENTREGADO_DEFAULT;
        this.titulo=titulo;
        this.creador=creador;
        genero=" ";
    }
    public Serie(String titulo,String creador,String genero,int temporadas){
        entregado=ENTREGADO_DEFAULT;
        this.titulo=titulo;
        this.creador=creador;
        this.genero=genero;
        this.temporadas=temporadas;
    }
    public void setTitulo(String titulo){this.titulo=titulo;}
    public void setGenero(String genero){this.genero = genero;}
    public void setCreador(String creador){this.creador=creador;}
    public void setTemporadas(int temporadas){this.temporadas=temporadas;}
    public int getTemporadas(){return temporadas;}
    public String getTitulo(){return titulo;}
    public String getGenero(){return genero;}
    public String getCreador(){return creador;}
    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", temporadas=" + temporadas +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                ", entregado=" + entregado +
                '}';
    }
}
