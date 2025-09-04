/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multipleclasses3;

import java.util.Scanner;

/**
 *
 * @author ByPag
 */
public class TriangleArea {
    Scanner Teclado =new Scanner (System.in);
    
    float a=0,b=0,c=0,p=0;
    
    double TriangleArea=0;
    
    void TriangleArea()
    {
        
        System.out.println("Bienvenido al programa para calcular el area del triangulo,siga las instrucciones por favor");
        
        System.out.println("Favor de Introducir el lado a del triangulo");       
        a=Teclado.nextFloat();
        System.out.println("Favor de Introducir el lado b del triangulo");       
        b=Teclado.nextFloat(); 
        System.out.println("Favor de Introducir el lado c del triangulo");       
        c=Teclado.nextFloat(); 
        
        p=(a+b+c)/2;
        
        TriangleArea=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        
        System.out.println("El area del triangulo cuyos lados son "+a+","+b+","+c+" es "+TriangleArea );
       
        
    }
}
