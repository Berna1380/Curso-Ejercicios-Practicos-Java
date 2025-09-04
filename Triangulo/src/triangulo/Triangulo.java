/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triangulo;

import java.util.Scanner;

/**
 *
 * @author ByPag
 */
public class Triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
    
    //Objeto Para Constructores//
    TrianguloClases TriangleType=new TrianguloClases("Triangulo");
    
    //UsoDeMetodos//
    Scanner Teclado = new Scanner (System.in);
    float x1;
    System.out.println("Otorga la coordinada x del punto 1");
    x1=Teclado.nextFloat();
    float y1;
    System.out.println("Otorga la coordinada y del punto 1");
    y1=Teclado.nextFloat();
    float x2;
    System.out.println("Otorga la coordinada x del punto 2");
    x2=Teclado.nextFloat();
    float y2;
    System.out.println("Otorga la coordinada y del punto 2");
    y2=Teclado.nextFloat();
    float x3;
    System.out.println("Otorga la coordinada x del punto 3");
    x3=Teclado.nextFloat();
    float y3;
    System.out.println("Otorga la coordinada y del punto 3");
    y3=Teclado.nextFloat();
    TriangleType.Area(x1,y1,x2,y2,x3,y3);
    
    
    }
    
}
