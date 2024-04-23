package punto5;
public class Renglones{
    protected int cantidadArticulos;
    protected String producto;
    protected double precioUnitario;
    protected double precioTotal;
    public Renglones(){
        cantidadArticulos=0;
        producto=" ";
        precioTotal=0;
        precioUnitario=0;
    }
    public Renglones(int cantidadArticulos,String producto,double precioUnitario){
        this.cantidadArticulos=cantidadArticulos;
        this.producto=producto;
        this.precioUnitario=precioUnitario;
        setPrecioTotal();
    }
    private void setPrecioTotal(){precioTotal=precioUnitario*cantidadArticulos;}

}
