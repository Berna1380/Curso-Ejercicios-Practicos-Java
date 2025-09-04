/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multipleclasses2;

import java.util.Scanner;

/**
 *
 * @author ByPag
 */
public class PythagorasTheorem {
    Scanner Teclado =new Scanner (System.in);
    
    float a=0,b=0;
    
    double Hypotenuse=0;
    double a2=0;
    double b2=0;
   
void Hypotenuse()
{
  System.out.println("Bienvenido al programa para calcular Hipotenusa,siga las instrucciones por favor");
  System.out.println("Favor de Introducir el cateto a ");       
  a=Teclado.nextFloat();
  System.out.println("Favor de Introducir el cateto b ");       
  b=Teclado.nextFloat(); 
  
  a2=Math.pow(a,2);  
  b2=Math.pow(b,2);  

  Hypotenuse=Math.sqrt(a2+b2);
  
  System.out.println("La hipotenusa del triangulo cuyos catetos a " + a + ",b" + b +" es " + Hypotenuse  );

    
}

}
