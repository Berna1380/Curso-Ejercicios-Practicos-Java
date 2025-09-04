/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multipleclasses5;

import java.util.Scanner;

/**
 *
 * @author ByPag
 */
public class Resultado {
    
 Scanner Teclado =new Scanner (System.in);
    
    double a1=0;
    double b1=0;
    double div=0;
    
    
    void Real()
    {
    System.out.println("Ingresa el dividendo numero a ");
    a1=Teclado.nextFloat();
    
    System.out.println("Ingresa el divisor numero b ");
    b1=Teclado.nextFloat();
    
    
    if (b1 <=0){
    System.out.println("El divisor no puede ser cero");
    } else {
    div=a1/b1;
    System.out.println("El resultado de la division es " +div );
        
        
    }
     
    }

    
    
    
    
}
