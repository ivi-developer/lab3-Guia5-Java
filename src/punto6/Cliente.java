package punto6;
import java.time.LocalDate;
public class Cliente{
    private String nombre;
    private LocalDate fecha;
    public Cliente(String nombre){this.nombre=nombre; fecha=LocalDate.now();}
    public Cliente(){nombre=" ";}
    public String getNombre(){return nombre;}
    public LocalDate getFecha(){return fecha;}
}
