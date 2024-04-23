package punto8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Pelicula{
    private String genero;
    private String titulo;
    private LocalDate fecha;
    private int duracion;
    private String clasificacionDeAudiencia;
    private String paisDeOrigien;
    private String descripcion;
    private int cantidad;
    private int popularidad;
    private static final ArrayList<String>generos=new ArrayList<>();
    private static final ArrayList<String>clasificacionesDeAudicencia=new ArrayList<>();
    public Pelicula(){}
    public Pelicula(String genero,String titulo,LocalDate fecha,int duracion,String clasificacionDeAudiencia,String paisDeOrigien,String descripcion,int cantidad){
        setGenero(Character.toUpperCase(genero.charAt(0))+genero.substring(1));
        this.titulo=titulo;
        this.fecha=fecha;
        this.duracion=duracion;
        setClasificacionDeAudiencia(clasificacionDeAudiencia.toUpperCase());
        this.paisDeOrigien=paisDeOrigien.toUpperCase();
        this.descripcion=descripcion;
        this.cantidad=cantidad;
        popularidad=0;
    }
    private void inicGeneros(){generos.addAll(Arrays.asList("accion","aventura","comedia","drama","horror","documental","ciencia ficcion"));}
    private void inicClasificacionDeAudiencia(){clasificacionesDeAudicencia.addAll(Arrays.asList("G","PG","PG-13","R","NC-17","UNRATED"));}

    //protected void setClasificacionDeAudiencia(String clasificacionDeAudiencia){
    //    inicClasificacionDeAudiencia();
    //    boolean listo=false;
    //    for(String clasificacionPosible:clasificacionesDeAudicencia) if(clasificacionDeAudiencia.equalsIgnoreCase(clasificacionPosible)){
    //        this.clasificacionDeAudiencia=clasificacionDeAudiencia;
    //        listo=true;
    //    }
    //    if(!listo) this.clasificacionDeAudiencia="UNRATED";
    //}
    protected void setClasificacionDeAudiencia(String clasificacionDeAudiencia){
        inicClasificacionDeAudiencia();
        for(String clasificacionPosible:clasificacionesDeAudicencia){
            if(clasificacionDeAudiencia.equalsIgnoreCase(clasificacionPosible)){
            this.clasificacionDeAudiencia=clasificacionDeAudiencia;
            return;
            }
            this.clasificacionDeAudiencia="UNRATED";
        }
    }//ES MALO EL USO DE BREAKS COMO EN EL CASO DE ABAJO, SERIA MEJOR USAR RETURNS VACIOS?
    protected void setGenero(String genero){
        inicGeneros();
        for(String generoPosible:generos) if(genero.equalsIgnoreCase(generoPosible)) {
            this.genero=genero;
            break;
        }
    }
    public String getTitulo(){return titulo;}
    public int getCantidad(){return cantidad;}
    public void decrementarCantidad(){cantidad--;}
    public void incrementarCantidad(){cantidad++;}
    public void incrementarPopularidad(){popularidad++;}
    @Override
    public String toString() {
        return "Pelicula{" +
                "genero='" + genero + '\'' +
                ", titulo='" + titulo + '\'' +
                ", fecha=" + fecha +
                ", duracion=" + duracion +
                ", clasificacionDeAudiencia='" + clasificacionDeAudiencia + '\'' +
                ", paisDeOrigien='" + paisDeOrigien + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", cantidad=" + cantidad +
                '}';
    }
}
