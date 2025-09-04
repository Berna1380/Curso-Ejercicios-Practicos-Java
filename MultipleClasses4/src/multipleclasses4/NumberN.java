/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multipleclasses4;

import java.util.Scanner;

/**
 *
 * @author ByPag
 */
public class NumberN {
    Scanner Teclado =new Scanner (System.in);
    
    double NumberN1=0;
    double Division=0;
    
    void NumberN1()
    {
    System.out.println("Ingresa el numero n ");
    NumberN1=Teclado.nextFloat();
    
    Division=NumberN1/10;
    if (Division > 0){
    System.out.println("El numero n "+ NumberN1 +" es multiplo de 10");
    } else {
    System.out.println("El numero n "+ NumberN1 +" no es multiplo de 10");
    }
     
    }
    
}
