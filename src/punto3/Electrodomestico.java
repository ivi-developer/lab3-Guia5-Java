package punto3;
import java.util.ArrayList;
public class Electrodomestico{
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;
    private static final String COLOR_DEFAULT="blanco";
    private static final char CONSUMOENERGETICO_DEFAULT='F';
    private static final double PRECIOBASE_DEFAULT=100;
    private static final double PESO_DEFAULT=5;
    private ArrayList<String>coloresDisponibles;
    private String chars="ABCDEF";
    private void cargarArraylist(){
        coloresDisponibles=new ArrayList<>();
        coloresDisponibles.add("Blanco");
        coloresDisponibles.add("Negro");
        coloresDisponibles.add("Rojo");
        coloresDisponibles.add("Azul");
        coloresDisponibles.add("Gris");
    }
    public Electrodomestico(){
        color=COLOR_DEFAULT;
        peso=PESO_DEFAULT;
        precioBase=PRECIOBASE_DEFAULT;
        consumoEnergetico=CONSUMOENERGETICO_DEFAULT;
        cargarArraylist();
    }
    public Electrodomestico(double precioBase,double peso){
        cargarArraylist();
        this.peso=peso;
        this.precioBase=precioBase;
        color=COLOR_DEFAULT;
        consumoEnergetico=CONSUMOENERGETICO_DEFAULT;
    }
    public Electrodomestico(double precioBase,double peso,String color,char consumoEnergetico){
        cargarArraylist();
        comprobarColor(color.substring(0,1).toUpperCase()+color.substring(1));
        comprobarConsumoEnergetico(Character.toUpperCase(consumoEnergetico));
        this.precioBase=precioBase;
        this.peso=peso;
    }
    protected String getColor(){return color;}
    protected double getPrecioBase(){return precioBase;}
    protected double getPeso(){return peso;}
    protected char getConsumoEnergetico(){return consumoEnergetico;}
    private void comprobarConsumoEnergetico(char letra){
        for(int i=0;i<chars.length();i++){
            if(chars.charAt(i)==letra)
            {
                this.consumoEnergetico=letra;
                break;
            }
            consumoEnergetico=CONSUMOENERGETICO_DEFAULT;
        }
    }
    private void comprobarColor(String color){
        for(int i=0;i<coloresDisponibles.size();i++){
            if(color.equalsIgnoreCase(coloresDisponibles.get(i))){
                this.color=color;
                break;
            }
            this.color=COLOR_DEFAULT;
        }
    }
    public double precioFinal(){

        return precioBase+precioTamanio()+precioLetra();}
    protected int precioLetra(){
        int precioLetra=0;
        switch(consumoEnergetico){
            case 'A':
                precioLetra=100;
                break;
            case 'B':
                precioLetra=80;
                break;
            case 'C':
                precioLetra=60;
                break;
            case 'D':
                precioLetra=50;
                break;
            case 'E':
                precioLetra=30;
                break;
            case 'F':
                precioLetra=10;
                break;
        }
        return precioLetra;
    }
    protected int precioTamanio(){
        if(peso>=0&&peso<=19) return 10;
        else if(peso>=20&&peso<=49) return 50;
        else if(peso>=50&&peso<=79) return 80;
        else if(peso>=80) return 100;
        return 0;
    }
    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precioBase=" + precioBase +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }
}
