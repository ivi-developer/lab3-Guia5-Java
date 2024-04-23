package punto8;

import java.util.ArrayList;
import java.util.Scanner;

public class InventarioFilms {
    private ArrayList<Pelicula>peliculas;
    private ArrayList<ClienteVideoCLub>clientesVideoCLub;
    public InventarioFilms(){
        peliculas=new ArrayList<>();
        clientesVideoCLub=new ArrayList<>();
    }
    public void agregarPelicula(Pelicula pelicula){peliculas.add(pelicula);}
    public void agregarCliente(ClienteVideoCLub clienteVideoCLub){clientesVideoCLub.add(clienteVideoCLub);}
    public void alquilarPelicula(String nombrePelicula){
        Scanner tec=new Scanner(System.in);
        for(Pelicula pelicula:peliculas){
            if(nombrePelicula.equalsIgnoreCase(pelicula.getTitulo())&&pelicula.getCantidad()>0){
                pelicula.decrementarCantidad();
                pelicula.incrementarPopularidad();
                System.out.println("Ingrese telefono del cliente");
                String numero=tec.next();
                if(!verificarClientes(numero)){
                    ClienteVideoCLub clienteVideoCLub=new ClienteVideoCLub();
                    clienteVideoCLub.setTelefeno(numero);
                    System.out.println("Ingrese el nombre");
                    clienteVideoCLub.setNombre(tec.next());
                    System.out.println("Ingrese la direccion");
                    clienteVideoCLub.setDireccion(tec.next());
                    agregarCliente(clienteVideoCLub);
                }
                System.out.println("Ingrese anio, mes y dia de devolucion");
                //int anio= tec.nextInt(),mes= tec.nextInt(),dia= tec.nextInt();
                BoletaDePrestamo boletaDePrestamo=new BoletaDePrestamo(20024, 6, 8, nombrePelicula);
                buscarCliente(numero).agregarBoletaDeCliente(boletaDePrestamo);
            }
        }
    }
    private boolean verificarClientes(String numero){
        for(ClienteVideoCLub clienteVideoCLub:clientesVideoCLub){
            if(clienteVideoCLub.getTelefeno().equalsIgnoreCase(numero)){
                return true;
            }
        }
        return false;
    }
    private ClienteVideoCLub buscarCliente(String numero){
        for(ClienteVideoCLub clienteVideoCLub:clientesVideoCLub){
            if(clienteVideoCLub.getTelefeno().equalsIgnoreCase(numero)){
                return clienteVideoCLub;
            }
        }
        return new ClienteVideoCLub();
    }
    public void devolverPelicula(String nombrePelicula){
        Scanner tec=new Scanner(System.in);
        for(Pelicula pelicula:peliculas){
            if(nombrePelicula.equalsIgnoreCase(pelicula.getTitulo())){
                System.out.println("Ingrese el numero del cliente");
                String n= tec.next();
                for(ClienteVideoCLub clienteVideoCLub:clientesVideoCLub){
                    if(clienteVideoCLub.getTelefeno().equals(n)){
                        pelicula.incrementarCantidad();
                        clienteVideoCLub.eleminarBoletaDeCliente(nombrePelicula);
                        return;
                    }
                }
                System.out.println("No se ecnontro la pelicula dentro de las boletas del cliente");
            }
            System.out.println("No se encontro la pelicula en catalogo");
        }
    }
    public String alquileresVigentes(){
        StringBuilder sb = new StringBuilder();
        for(ClienteVideoCLub clienteVideoCLub:clientesVideoCLub){
            sb.append(clienteVideoCLub.getNombre()).append(": ").append(clienteVideoCLub.mostrarBoletas()).append("\n");
        }
        return sb.toString();
    }


}
