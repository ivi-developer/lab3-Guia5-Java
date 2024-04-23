package punto5;
import java.util.ArrayList;
public class Clientes{
    public ArrayList<Clienteregular>clienteregulares;
    public Clientes(){
        clienteregulares=new ArrayList<>();
    }
    public void addClient(Clienteregular clienteregular){
        clienteregulares.add(clienteregular);
    }
    //castear si es mayoristaaaaaAAA me fijjo en la factura que es el cliente
    //EL CASTEO ES SI YO TENGO EL METODO EN LA CLASE HIJA, NO EN LA MADRE,PORLOQUE SE CASTEA A UNA CLASE HIJA PARA PODER ACCEDER AL METODO
    public void mostrarCLientes(){
        for(Clienteregular clienteregular:clienteregulares)
        {
            System.out.println(clienteregular.toString());
        }
    }
}
