package punto5;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;
public class Factura{
    protected UUID numeroDeFactura;
    protected LocalDateTime fecha;
    protected ArrayList<Renglones>renglones;
    public Factura(){
        numeroDeFactura=UUID.randomUUID();
        fecha=LocalDateTime.now();
        renglones=new ArrayList<>();
    }
    public void agregarRenglon(int cantidadArticulos,String producto,double precioUniatario){
        Renglones renglon=new Renglones(cantidadArticulos,producto,precioUniatario);
        renglones.add(renglon);
    }

    protected double totalDeRenglones(){
        double total=0;
        for(int i=0;i<renglones.size();i++){
            total+=renglones.get(i).precioTotal;
        }
        return total;
    }
    public StringBuilder mostrarFactura(){
        StringBuilder facturaBuilder = new StringBuilder();
        facturaBuilder.append("Número de Factura: ").append(numeroDeFactura).append("\n");
        facturaBuilder.append("Fecha: ").append(fecha).append("\n");
        for(Renglones renglon : renglones){
            facturaBuilder.append("Cantidad: ").append(renglon.cantidadArticulos).append(", ");
            facturaBuilder.append("Producto: ").append(renglon.producto).append(", ");
            facturaBuilder.append("Precio Unitario: ").append(renglon.precioUnitario).append(", ");
            facturaBuilder.append("Precio Total: ").append(renglon.precioTotal).append("\n");
        }
        facturaBuilder.append("Total de la Factura: ").append(totalDeRenglones());
        return facturaBuilder;
    }
}
