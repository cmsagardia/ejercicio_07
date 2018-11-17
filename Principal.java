/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Principal_cuentaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cliente cl1=new Cliente("Mario","Riatuzo",34518965);
        Cuenta c1=new Cuenta(01,cl1,20159);
    
        System.out.println(c1.dameDatos());
        System.out.println(c1);
    }
    
}
