/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentacajero;

/**
 *
 * @author ByPag
 */

public class Cuentacajero {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cuenta cuenta_1=new Cuenta("Carlos",0);
        Cuenta cuenta_2=new Cuenta ("Pedro",0);
        cuenta_1.ingresar(50);
        cuenta_2.ingresar(20);
        
        cuenta_1.retirar(150);
        cuenta_2.retirar(100);
        
        System.out.println(cuenta_1);
        System.out.println(cuenta_2);
    }
    
}


        
        
