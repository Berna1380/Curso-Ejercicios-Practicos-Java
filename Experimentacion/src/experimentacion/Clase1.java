/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package experimentacion;

import java.util.Scanner;

/**
 *
 * @author ByPag
 */
public class Clase1 {
void funcion(double grado,double poli[],double x){ 
int i; 
Scanner teclado=new Scanner(System.in); 
double polinomio,resultado; 
for(i=0;i<grado+1;i=i+1) { 
System.out.print("Poli"+"[" +i +"]"); 
poli[i]=teclado.nextInt(); 
} 
//Calculo 
polinomio=0; 
for(i=0;i<grado+1;i++){ 
resultado=Math.pow(x, i); 
polinomio=polinomio+poli[i]*resultado;

}
 
System.out.println("El valor es " +polinomio); 
}
}
