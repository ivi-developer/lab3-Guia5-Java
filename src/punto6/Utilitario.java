package punto6;
public class Utilitario extends Vehiculo{
    private String tipoDeCarga;
    public Utilitario(){
        super();
        tipoDeCarga=" ";
    }
    public Utilitario(String patente,String marca,String modelo,int anio, int kilometraje,double precioDeAlquiler,String estado, String tipoDeCarga){
        super(patente, marca, modelo, anio, kilometraje, precioDeAlquiler, estado);
        this.tipoDeCarga=tipoDeCarga;
    }
    @Override
    public String toString(){
        return "Utilitario{" +
                super.toString()+
                "tipoDeCarga='" + tipoDeCarga + '\'' +
                '}';
    }
}
