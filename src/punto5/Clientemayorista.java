package punto5;

import java.util.Random;

public class Clientemayorista extends Clienteregular{
    private int descuento;
    public Clientemayorista(){
        super();
        descuento=0;
    }
    public Clientemayorista(String nombre,String domicilio,int cuit){
        super(nombre,domicilio,cuit);
        descuento=new Random().nextInt(5,50);
    }
    public double totalFacturaConDescuento(){
      return factura.totalDeRenglones()-factura.totalDeRenglones()*descuento/100;
    }

    @Override
    public String toString() {
        return "Clientemayorista{" +
                super.toString()+
                "descuento= " + descuento +
                ", total con descuento= "+totalFacturaConDescuento()+
                '}';
    }

}
