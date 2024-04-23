import punto1.Persona;
import punto2.Password;
import punto3.Electrodomestico;
import punto3.Lavadora;
import punto3.Television;
import punto5.Clientemayorista;
import punto5.Clienteregular;
import punto5.Clientes;
import punto6.Utilitario;
import punto6.Vehiculo;
import punto6.Vehiculos;
import punto7.Socio;
import punto7.SocioAusente;
import punto7.SocioVitalacio;
import punto7.Socios;
import punto8.BoletaDePrestamo;
import punto8.ClienteVideoCLub;
import punto8.InventarioFilms;
import punto8.Pelicula;

import javax.swing.*;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        menu();
    }
    public static void menu(){
        Scanner tec=new Scanner(System.in);
        do{
            System.out.println("Ingrese ejercicio:");
            switch(tec.nextInt()){
                case 1:
                    punto1(tec);
                    break;
                case 2:
                    punto2(tec);
                    break;
                case 3:
                    punto3();
                    break;
                case 5:
                    punto5();
                    break;
                case 6:
                    punto6();
                    break;
                case 7:
                    punto7();
                    break;
                case 8:
                    punto8();
                    break;
                default:
                    System.out.println("le pifiaste wachin");
                    break;
            }
            System.out.println("n para cortar ejecucion");
        }while(tec.next().charAt(0)!='n');
    }
    public static void punto1(Scanner tec){
        Persona persona=new Persona(tec.next(),tec.nextInt(),tec.next().charAt(0),tec.nextDouble(),tec.nextDouble());
        System.out.println(persona.toString());
        persona.mostrarCalculoDeIMC();
        persona.mostrarSiesMayor();
        Persona persona1=new Persona(tec.next(),tec.nextInt(),tec.next().charAt(0));
        persona1.setPeso(tec.nextDouble());
        persona1.setAltura(tec.nextDouble());
        System.out.println(persona1.toString());
        persona1.mostrarCalculoDeIMC();
        persona1.mostrarSiesMayor();
    }
    public static void punto2(Scanner tec){
        Password password=new Password(25);
        System.out.println(password.toString());
        password.mostrarSiEsFuerte();
        int tamañoArrays= tec.nextInt();
        Password arrayContras[]=new Password[tamañoArrays];;
        boolean arrayFuerte[]=new boolean[tamañoArrays];;
        ///Bucle Arreglos Paralelos
        int longitud = tec.nextInt();
            for (int i = 0; i < tamañoArrays; i++){
                arrayContras[i] = new Password(longitud);
                if(arrayContras[i].esFuerte()) arrayFuerte[i]=true;
                else arrayFuerte[i]=false;
            }
        for (int i = 0; i < tamañoArrays; i++){System.out.println(arrayContras[i].toString()+" "+arrayContras[i].mostrarSiEsFuerte());}
    }
    public static void punto3(){
        Electrodomestico electrodomestico=new Electrodomestico(10000,500,"rojo",'c');
        System.out.println(electrodomestico.toString());
        System.out.println(electrodomestico.precioFinal());
        Electrodomestico[] electrodomesticos=new Electrodomestico[7];
        //ArrayList<Electrodomestico>electrodomesticos=new ArrayList<>();
        Television television=new Television(5000,20,"negra",'a',45,true);
        //electrodomesticos.add(television);
        electrodomesticos[0]=television;
        Lavadora lavadora=new Lavadora(50,40000,50,"blanco",'b');
        //electrodomesticos.add(lavadora);
        electrodomesticos[1]=lavadora;
        Electrodomestico electrodomestico1=new Electrodomestico(5000,10);
        //electrodomesticos.add(electrodomestico);
        electrodomesticos[2]=electrodomestico;
        //electrodomesticos.add(electrodomestico1);
        electrodomesticos[3]=electrodomestico1;
        Lavadora lavadora1=new Lavadora();
        Lavadora lavadora2=new Lavadora(100000,30);
        Television television1=new Television(500000,20);
        //electrodomesticos.add(lavadora1);
        electrodomesticos[4]=lavadora1;
        //electrodomesticos.add(lavadora2);
        electrodomesticos[5]=lavadora2;
        //electrodomesticos.add(television1);
        electrodomesticos[6]=television1;
        int precioLavadoras=0;
        int precioTelevisores=0;
        int precioElectrodmesticos=0;
        for(Electrodomestico electrodomestico2:electrodomesticos){
            if(electrodomestico2 instanceof Lavadora){
                precioLavadoras+=electrodomestico2.precioFinal();
                precioElectrodmesticos+=electrodomestico2.precioFinal();
            }
            else if(electrodomestico2 instanceof Television){
                precioTelevisores+=electrodomestico2.precioFinal();
                precioElectrodmesticos+=electrodomestico2.precioFinal();
            }
            else precioElectrodmesticos+=electrodomestico2.precioFinal();
        }
        System.out.println("El precio de los electrodomesticos: "+precioElectrodmesticos+'\n'+"El precio de los televisores: "+precioTelevisores+'\n'+"El precio de los lavarropas: "+precioLavadoras);
    }
    public static void punto5(){
        Clienteregular clienteregular=new Clienteregular("gordoRePuto","en la concha de tu madre", 200000);
        clienteregular.factura.agregarRenglon(10,"discos de arroz",500);
        clienteregular.factura.agregarRenglon(5,"yerba rosamonte",1000);
        //System.out.printf(clienteregular.toString());
        Clientes clientes=new Clientes();
        clientes.addClient(clienteregular);
        Clientemayorista clientemayorista=new Clientemayorista("otroGordo","aca a la vuelta", 300000);
        clientemayorista.factura.agregarRenglon(20,"molleja",5000);
        clientemayorista.factura.agregarRenglon(10,"chinchu",3000);
        clientes.addClient(clientemayorista);
        clientes.mostrarCLientes();
    }
    public static void punto6(){
        Vehiculo vehiculo=new Vehiculo("AB102CD","VOLKSWAGEN","Vento",2015,20000,10000,"disponible");
        vehiculo.alquilarVehiculo("ivi");
        vehiculo.devolverVehiculo();
        vehiculo.alquilarVehiculo("pablin");
        vehiculo.devolverVehiculo();
        Utilitario utilitario=new Utilitario("GJK321","VOLKSWAGEN","CAMION1",2020,100000,50000,"disponible","una caravana de putas");
        utilitario.alquilarVehiculo("peke");
        utilitario.devolverVehiculo();
        utilitario.alquilarVehiculo("luz");
        Vehiculos vehiculos=new Vehiculos();
        vehiculos.agregarVehiculo(vehiculo);
        vehiculos.agregarVehiculo(utilitario);
        vehiculos.mostrarFlota();

    }
    public static void punto7(){
        SocioVitalacio socioVitalacio=new SocioVitalacio("ivi");
        SocioAusente socioAusente=new SocioAusente("pablin");
        socioAusente.pagarCuota();
        SocioAusente socioAusente1=new SocioAusente("peke");
        Socio socio1=new Socio("luchi");
        socio1.pagarCuota();
        Socio socio=new Socio("ted");
        Socios socios=new Socios();
        socios.agregarSocio(socioVitalacio);
        socios.agregarSocio(socioAusente);
        socios.agregarSocio(socio);
        socios.agregarSocio(socio1);
        socios.agregarSocio(socioAusente1);
        socios.mostrarSocios();
        System.out.println("SOCIOS DEUDORES");
        socios.mostrarDeudores();
    }
    public static void punto8(){
        Pelicula harryPostre=new Pelicula("Ciencia ficcion","HarryPostre", LocalDate.of(2005,5,25),120,"g","Ing","el conserje se va de putas con harry",50);
        ClienteVideoCLub pablin=new ClienteVideoCLub("pablin","1","aca a la vuelta");
        Pelicula laRenga=new Pelicula("documental","la renga",LocalDate.of(2024,3,20),90,"pg-12","Arg","La banda de rock de todos los tiempos",10);
        ClienteVideoCLub ivi=new ClienteVideoCLub("ivi","2","alla a la vuelta");
        System.out.println(harryPostre.toString());
        System.out.println(laRenga.toString());
        InventarioFilms inventarioFilms=new InventarioFilms();
        inventarioFilms.agregarPelicula(harryPostre);
        inventarioFilms.agregarPelicula(laRenga);
        inventarioFilms.agregarCliente(pablin);
        inventarioFilms.agregarCliente(ivi);
        inventarioFilms.alquilarPelicula("harrypostre");
        inventarioFilms.alquilarPelicula("harryPostre");
        inventarioFilms.alquilarPelicula("la renga");
        inventarioFilms.alquilarPelicula("la renga");
        inventarioFilms.devolverPelicula("harryPostre");
        System.out.println(harryPostre.toString());
        System.out.println("ALQUILERES VIGENTES");
        System.out.println(inventarioFilms.alquileresVigentes());
    }
}
