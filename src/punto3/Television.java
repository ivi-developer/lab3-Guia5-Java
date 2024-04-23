package punto3;
public class Television extends Electrodomestico {
    private int resolucion;
    private boolean sintonizador;
    private static final int RESOLUCION_DEFAULT = 20;
    private static boolean SINTONIZADOR_DEFAULT = false;
    public Television() {
        super();
        resolucion = RESOLUCION_DEFAULT;
        sintonizador = SINTONIZADOR_DEFAULT;
    }
    public Television(double precio, double peso) {
        super(precio, peso);
        resolucion = RESOLUCION_DEFAULT;
        sintonizador = SINTONIZADOR_DEFAULT;
    }
    public Television(double precio, double peso, String color, char consumoEnergetico, int resolucion, boolean sintonizador) {
        super(precio, peso, color, consumoEnergetico);
        this.sintonizador = sintonizador;
        this.resolucion = resolucion;
    }
    public int getResolucion() {
        return resolucion;
    }
    public boolean isSintonizador() {
        return sintonizador;
    }
    @Override
    public double precioFinal() {
        return getPrecioBase() + precioTamanio() + precioLetra()+verificarPulgadas()+verificarTDT();
    }
    public double verificarPulgadas() {
        if(resolucion>=40) return getPrecioBase()*0.3;
        else return 0;
    }
    public double verificarTDT(){
        if(sintonizador) return 50;
        else return 0;
    }

}