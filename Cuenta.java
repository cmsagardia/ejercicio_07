/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Cuenta {
    
public Cuenta(int n, Cliente c, double s){
    
    numero=n;
    c1=c;
    saldo=s;
}    

    @Override
    public String toString() {
        return "Cuenta{" + "numero=" + numero + ", c1=" + c1 + ", saldo=" + saldo + '}';
    }
 
public String dameDatos(){
    return "Número de cuenta: "+numero+", Saldo:: "+saldo;
}
    
private int numero;
private Cliente c1;
private double saldo;
}
