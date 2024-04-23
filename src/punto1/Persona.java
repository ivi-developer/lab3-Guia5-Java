package punto1;
import java.io.CharArrayReader;
import java.util.Random;
public class Persona {
    private static final int ES_MAYOR=18;
    private static final char SEXO_DEFAULT='H';
    private static final int POCO_PESO=-1;
    private static final int PESO_IDEAL=0;
    private static final int SOBRE_PESO=1;
    private String nombre;
    private int dni;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;
    public Persona(){
        nombre="";
        dni=0;
        edad=0;
        sexo=SEXO_DEFAULT;
        peso=0;
        altura=0;
    }
    public Persona(String nombre,int edad,char sexo){
        this.nombre=nombre;
        this.edad=edad;
        comprobarSexo(sexo);
        peso=0;
        altura=0;
        genereaDNI();
    }
    public Persona(String nombre,int edad,char sexo,double peso,double altura){
        this.nombre=nombre;
        genereaDNI();
        this.edad=edad;
        comprobarSexo(sexo);
        this.peso=peso;
        this.altura=altura;
    }
    public void setSexo(char sexo) {this.sexo=sexo;}
    private int calcularIMC(){
        //isBetween(numero, limiteInferior, limiteSuperior)
        double imc=peso/(Math.pow(altura,2));
        if(imc<20) return POCO_PESO;
        else if(imc>25) return SOBRE_PESO;
        else return PESO_IDEAL;
    }
    private boolean esMayorDeEdad(){
        if(edad>=ES_MAYOR) return true;
        else return false;
    }
    private void comprobarSexo(char sexo){
        if(Character.toUpperCase(sexo)!='H'&&Character.toUpperCase(sexo)!='M') setSexo(SEXO_DEFAULT);
        else setSexo(Character.toUpperCase(sexo));
    }
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
    private void genereaDNI(){dni=new Random().nextInt(10000000,99999999);}
    public void setNombre(String nombre){this.nombre=nombre;}
    public void setEdad(int edad){this.edad=edad;}
    public void setAltura(double altura){this.altura=altura;}
    public void setPeso(double peso){this.peso=peso;}
    public void mostrarCalculoDeIMC(){System.out.println(calcularIMC()==POCO_PESO?"El peso es bajo":calcularIMC()==PESO_IDEAL?"El peso es ideal":"gordito lechon");}
    public void mostrarSiesMayor(){System.out.println(esMayorDeEdad()?"Es mayor":"Es menor");}
}
