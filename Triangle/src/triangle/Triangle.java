/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triangle;

import java.util.Scanner;

/**
 *
 * @author ByPag
 */
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Objeto Para Constructores//
        IsoscelesTriangle TriangleType=new IsoscelesTriangle("Triangulo Equilatero",2 );
        
        //UsoDeMetodos//
        Scanner Teclado = new Scanner (System.in);
        System.out.println(TriangleType);
        float LongitudDeLadoIgual;
        System.out.println("Otorga la longitud del lado Igual");
        LongitudDeLadoIgual=Teclado.nextFloat();
        float LongitudDeLadoDesigual;
        System.out.println("Otorga la longitud del lado Desigual");
        LongitudDeLadoDesigual=Teclado.nextFloat();
        TriangleType.Perimetro(LongitudDeLadoIgual,LongitudDeLadoDesigual);
        float Altura;
        System.out.println("Otorga la altura del Triangulo");
        Altura=Teclado.nextFloat();
        TriangleType.Area(Altura);
  
    }
    
}
