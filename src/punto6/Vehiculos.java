package punto6;
import java.util.ArrayList;

public class Vehiculos{
    public ArrayList<Vehiculo>vehiculos;
    public Vehiculos(){
        vehiculos=new ArrayList<>();
    }
    public void agregarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }
    public void mostrarFlota(){
        for(Vehiculo vehiculo:vehiculos){
            System.out.println(vehiculo.toString());
        }
    }
}

