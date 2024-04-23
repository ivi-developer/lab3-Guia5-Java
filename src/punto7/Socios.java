package punto7;
import java.util.ArrayList;

public class Socios{
    public ArrayList<Socio>socios;
    public ArrayList<Socio>deudores;
    public Socios(){socios=new ArrayList<>();deudores=new ArrayList<>();}
    public void agregarSocio(Socio socio){socios.add(socio);}
    public void mostrarSocios(){for(Socio socio:socios) System.out.println(socio.toString());}
    public void mostrarDeudores(){
        cargarDeudores();
        for(Socio socio:deudores) System.out.println(socio.toString());
    }
    private void cargarDeudores(){for(Socio socio:socios) if(socio.deuda>0) deudores.add(socio);}
}
