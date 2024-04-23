package punto5;
public class Clienteregular{
    protected String nombre;
    protected String domicilio;
    protected int cuit;
    public Factura factura;
    public Clienteregular(){
        nombre=" ";
        domicilio=" ";
        cuit=0;
        factura=new Factura();
    }
    public Clienteregular(String nombre,String domicilio,int cuit){
        this.nombre=nombre;
        this.domicilio=domicilio;
        this.cuit=cuit;
        factura=new Factura();
    }
    @Override
    public String toString() {
        return "Clienteregular{" +
                "nombre='" + nombre + '\'' +
                ", domicilio='" + domicilio + '\'' +
                ", cuit=" + cuit +
                ", factura=" + factura.mostrarFactura() +
                '}';
    }
}
