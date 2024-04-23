package punto8;
import java.time.LocalDate;
public class BoletaDePrestamo{
    private LocalDate fechaDeRetiro;
    private LocalDate fechaDeDevolucion;
    private String nombreDePelicula;
    public BoletaDePrestamo(int year, int month,int day, String nombreDePelicula){
        fechaDeRetiro=LocalDate.now();
        setFechaDeRetiro(year,month,day);
        this.nombreDePelicula=nombreDePelicula;
    }
    public void setFechaDeRetiro(int year,int month,int day){fechaDeDevolucion=LocalDate.of(year,month,day);}
    public String getTitulo(){return nombreDePelicula;}
    @Override
    public String toString() {
        return "BoletaDePrestamo{" +
                "fechaDeRetiro=" + fechaDeRetiro +
                ", fechaDeDevolucion=" + fechaDeDevolucion +
                ", nombreDePelicula='" + nombreDePelicula + '\'' +
                '}';
    }
}
