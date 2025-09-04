/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package experimentacion;

import java.util.Scanner;

/**
 *
 * @author ByPag
 */
public class Experimentacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner teclado=new Scanner(System.in); 
int grado; 
double poli[]; 
poli = new double[100]; 
double x; 
Clase1 llama=new Clase1(); 
System.out.println("Ingrese Grado del Polinomio: "); 
grado=teclado.nextInt(); 
System.out.println("Ingrese el valor de X"); 
x=teclado.nextDouble(); 
llama.funcion(grado, poli, x); 
} 
} 


    
    

