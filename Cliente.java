

/**
 *
 * @author Usuario
 */
public class Cliente {

public Cliente(String n, String a, int d){
    
    nombre=n;
    apellido=a;
    dni=d;
}    
    
private String nombre;
private String apellido;
private int dni;

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + '}';
    }

}
