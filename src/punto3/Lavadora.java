package punto3;
public class Lavadora extends Electrodomestico{
    private int carga;
    private static final int CARGAR_DEFAULT = 5;
    public Lavadora(){
        super();
        carga=CARGAR_DEFAULT;
    }
    public Lavadora(double precio,double peso){
        super(precio,peso);
        carga=CARGAR_DEFAULT;
    }
    public Lavadora(int carga,double precio,double peso,String color, char consumoElectrico){
        super(precio,peso,color,consumoElectrico);
        this.carga=carga;
    }
    public int getCarga(){return carga;}
    @Override
    public double precioFinal(){
        if(carga>30) return 50+getPrecioBase()+precioTamanio()+precioLetra();
        else return getPrecioBase()+precioTamanio()+precioLetra();
    }

}
