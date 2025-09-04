/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multipleclasses;

import java.util.Scanner;

/**
 *
 * @author ByPag
 */
public class SpeedConverter {
    Scanner Teclado =new Scanner (System.in);
    
    float SpeedKh=0;
    
    double SpeedMs=0;
    
void SpeedMs()
{    
     System.out.println("Favor de Introducir la velocidad en kilometros por hora ");       
     SpeedKh=Teclado.nextFloat();
    
    SpeedMs=(SpeedKh*1000)/(3600);
    
     System.out.println("Los kilometros por hora en metros por segundo son " + SpeedMs );       
}
}
