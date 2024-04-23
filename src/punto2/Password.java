package punto2;
import java.util.Random;
public class Password{
    private static final String CHARS="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz012345678";
    private static final int LONGITUD_RAND=8;
    private int longitud;
    private StringBuilder contrasenia;
    public Password(){
        longitud=0;
        contrasenia=new StringBuilder();
        while(LONGITUD_RAND>longitud){
            contrasenia.append(CHARS.charAt(new Random().nextInt(CHARS.length())));
            longitud++;
        }
    }
    public Password(int longitud){
        contrasenia=new StringBuilder();
        while(longitud>this.longitud){
            contrasenia.append(CHARS.charAt(new Random().nextInt(CHARS.length())));
            this.longitud++;
        }
    }
    public void setLongitud(int longitud){this.longitud = longitud;}
    public int getLongitud(){return longitud;}
    public StringBuilder getContrasenia(){return contrasenia;}
    public boolean esFuerte(){
        int esMinuscula=0,esMayuscula=0,esInt=0;
        for(int i=0;i<contrasenia.length();i++) {
            if(Character.isLowerCase(contrasenia.charAt(i))) esMinuscula++;
            else if(Character.isUpperCase(contrasenia.charAt(i))) esMayuscula++;
            else if(Character.isDigit(contrasenia.charAt(i))) esInt++;
        }
        return esInt>5&&esMinuscula>1&&esMayuscula>2;
    }
    public String mostrarSiEsFuerte() {
        return esFuerte() ? "es fuerte" : "no es fuerte";
    }
        @Override
        public String toString () {
            return "Password{" +
                    "longitud=" + longitud +
                    ", contrasenia=" + contrasenia +
                    '}';
        }
    }


