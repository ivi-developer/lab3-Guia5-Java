package punto8;

import java.util.ArrayList;

public class
ClienteVideoCLub {
    private String nombre;
    private String telefeno;
    private String direccion;
    private ArrayList<BoletaDePrestamo>boletaDePrestamos;
    private ArrayList<BoletaDePrestamo>historialDePestamos;
    public ClienteVideoCLub(){
        boletaDePrestamos=new ArrayList<>();
        historialDePestamos=new ArrayList<>();
    }
    public ClienteVideoCLub(String nombre,String telefeno,String direccion){
        this.nombre=Character.toUpperCase(nombre.charAt(0))+nombre.substring(1);
        this.telefeno=telefeno;
        this.direccion=direccion;
        boletaDePrestamos=new ArrayList<>();
        historialDePestamos=new ArrayList<>();
    }
    public String getTelefeno(){return telefeno;}
    public void agregarBoletaDeCliente(BoletaDePrestamo boletaDePrestamo){
        boletaDePrestamos.add(boletaDePrestamo);
        historialDePestamos.add(boletaDePrestamo);
    }
    public void eleminarBoletaDeCliente(String nombrePelicula){
        for(BoletaDePrestamo boletaDePrestamo:boletaDePrestamos){
            if(boletaDePrestamo.getTitulo().equalsIgnoreCase(nombrePelicula)){
                boletaDePrestamos.remove(boletaDePrestamo);
                System.out.println("Boleta eliminada");
                return;
            }
        }
    }
    public ArrayList<BoletaDePrestamo> getBoletaDePrestamos(){return boletaDePrestamos;}

    public String mostrarBoletas() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < boletaDePrestamos.size(); i++) {
            sb.append(boletaDePrestamos.get(i).toString()+"\n");
        }
        return sb.toString();
    }
    public String getNombre(){return nombre;}
    public void setTelefeno(String telefeno){this.telefeno=telefeno;}
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setDireccion(String direccion){this.direccion=direccion;}
}
