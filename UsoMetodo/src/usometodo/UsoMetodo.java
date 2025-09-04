/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usometodo;

import java.util.Scanner;

/**
 *
 * @author ByPag
 */
public class UsoMetodo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        Operaciones llamadoMetodo = new Operaciones();
        float variableA, variableB;
        System.out.println("Dame primer valor ");
        variableA=teclado.nextFloat();
        System.out.println("Dame segundo valor ");
        variableB=teclado.nextFloat();
        
        llamadoMetodo.Suma(variableA, variableB);
        llamadoMetodo.Resta(variableA, variableB);
   
    }
    
}

