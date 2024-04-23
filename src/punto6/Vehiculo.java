package punto6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Vehiculo{
    private String patente;
    private String marca;
    private String modelo;
    private int anio;
    private int kilometraje;
    private double precioDeAlquiler;
    private String estado;
    private Cliente cliente;
    private ArrayList<String>estadosPosibles;
    private ArrayList<StringBuilder>historialDeAlquileres;
    public Vehiculo(){
        inicEstados();
        historialDeAlquileres=new ArrayList<>();
        patente=" ";
        marca=" ";
        modelo=" ";
        anio=0;
        kilometraje=0;
        precioDeAlquiler=0;
        estado=" ";
    }
    public Vehiculo(String patente,String marca,String modelo,int anio,int kilometraje, double precioDeAlquiler,String estado){
        inicEstados();
        historialDeAlquileres=new ArrayList<>();
        this.patente=patente;
        this.marca=marca;
        this.modelo=modelo;
        this.anio=anio;
        this.kilometraje=kilometraje;
        this.precioDeAlquiler=precioDeAlquiler;
        setEstado(estado);
    }
    private void inicEstados(){
        estadosPosibles=new ArrayList<>();
        estadosPosibles.addAll(Arrays.asList("Disponible","Alquilado","En reparacion","En verificacion"));
    }
    public void setAnio(int anio){this.anio = anio;}
    public void setPatente(String patente){this.patente=patente;}
    public void setMarca(String marca){this.marca=marca;}
    public void setKilometraje(int kilometraje){this.kilometraje = kilometraje;}
    public void setModelo(String modelo){this.modelo = modelo;}
    public void setPrecioDeAlquiler(double precioDeAlquiler){this.precioDeAlquiler = precioDeAlquiler;}
    public void setEstado(String estado){
        for(String estadoPosible:estadosPosibles){
            if(estadoPosible.equalsIgnoreCase(estado))this.estado = estado;
        }
    }
    public void alquilarVehiculo(String nombre){
        if(estado.equalsIgnoreCase("disponible")){
            cliente=new Cliente(nombre);
            historialDeAlquileres.add(new StringBuilder("Alquilado por ").append(cliente.getNombre()).append(" en la fecha ").append(cliente.getFecha()));
            setEstado("alquilado");
        }
        else System.out.println("el vehiculo no se encuentra disponible");
    }
    private int getKilometraje(){return kilometraje;}
    public void devolverVehiculo(){
        getKilometraje();
        setEstado("En verificaion");
        revisionTecnica();
    }
    private void revisionTecnica(){
        do{
        setEstado(estadosPosibles.get(new Random().nextInt(0,estadosPosibles.size())));
        }while(estado.equalsIgnoreCase("alquilado"));
    }
    @Override
    public String toString() {
        return "Vehiculo{" +
                "patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", kilometraje=" + kilometraje +
                ", precioDeAlquiler=" + precioDeAlquiler +
                ", estado='" + estado + '\'' +
                ", historialDeAlquileres=" + historialDeAlquileres +
                '}';
    }
}
