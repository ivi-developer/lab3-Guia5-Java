package punto7;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
public class Socio{
    protected double cuota;
    protected double accesoAClub;
    protected String nombre;
    protected UUID id;
    protected LocalDate fecha;
    protected double deuda;
    private static final double VALOR_CUOTA=5000;
    private static final double VALOR_ACCESO=250;
    public Socio(){}
    public Socio(String nombre){
        this.nombre=nombre;
        id=UUID.randomUUID();
        fecha=LocalDate.now();
        cuota=VALOR_CUOTA;
        deuda=VALOR_ACCESO;
        accesoAClub=VALOR_ACCESO;
    }
    protected void setCuota(double cuota){
        this.cuota=cuota;
    }
    public double getAccesoAClub(){return accesoAClub;}
    @Override
    public String toString() {
        return "Socio{" +
                " nombre=" + nombre  +
                ", fecha de bienvenida=" + fecha +
                ", id=" + id +
                ", valor de acceso=" + accesoAClub +
                ", cuota=" + cuota +
                ", deuda= "+deuda+
                '}';
    }
    public void pagarCuota(){
        deuda=0;
    }
}
