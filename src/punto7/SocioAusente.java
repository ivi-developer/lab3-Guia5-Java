package punto7;
public class SocioAusente extends Socio{
    private double cuotaAnual;
    private static final double CUOTA_ANUAL_DEFAULT=45000;
    private static final int DESCUENTO_ACCESO=25;
    public SocioAusente(){}
    public SocioAusente(String nombre){
        super(nombre);
        setCuota(0);
        aplicarDescuentoDeAcceso();
        cuotaAnual=CUOTA_ANUAL_DEFAULT;
        deuda=CUOTA_ANUAL_DEFAULT;
    }
    private void aplicarDescuentoDeAcceso(){
        accesoAClub=accesoAClub-accesoAClub*DESCUENTO_ACCESO/100;
    }
    public String toString(){
        return "Socio Ausente{"+
                " nombre= "+nombre+
                ", fecha de bienvenida= "+fecha+
                ", id= "+id+
                ", valor de acceso= "+accesoAClub+
                ", cuota anual= "+cuotaAnual+
                ", deuda= "+deuda
                +'}'
                ;
    }
}
