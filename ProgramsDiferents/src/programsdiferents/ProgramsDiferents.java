/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programsdiferents;


import java.util.Scanner;


/**
 *
 * @author ByPagee1973
 */
public class ProgramsDiferents {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner Teclado =new Scanner(System.in);
        
        System.out.println("Bienvenido al sistema para obtener la longitud y area de un circulo");
        
        int Longitud;
        int Area;
        int Radio;
        int RadioCuadrado;
        
        System.out.println("Ingresa El Radio Del Circulo");
        Radio=Teclado.nextInt();
       
        
        RadioCuadrado=Radio*Radio;
        Longitud=(int) (2*Math.PI*Radio);
        Area=(int)(Math.PI*RadioCuadrado);
        
        System.out.println("El circulo cuyo radio es " + Radio + " posee una longitud de " + Longitud );
        System.out.println("El circulo cuyo radio es " + Radio + " posee una Area de " + Area );
        
        
    }
}
    
