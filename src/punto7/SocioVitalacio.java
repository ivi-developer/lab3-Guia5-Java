package punto7;
public class SocioVitalacio extends Socio{
    public SocioVitalacio(){super();}
    public SocioVitalacio(String nombre){
        super(nombre);
        setCuota(0);
        pagarCuota();
    }
    @Override
    public String toString() {
        return "Socio vitalico{ "+
                " nombre"+nombre+
                ", fecha de bienvenida= "+fecha+
                ", id= "+id+'}'
                ;
    }
}
