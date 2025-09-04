/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangulo;

/**
 *
 * @author ByPag
 */
public class TrianguloClases {
    //Atributo//
    public String TypeTriangle;
    public float Area;

     //Constructor//
    public TrianguloClases(String TypeTriangle){
    this.TypeTriangle=TypeTriangle;    
    }
        
    //Metodo//
    public void Area(float x1,float y1,float x2,float y2, float x3, float y3){
    Area=((x1)*(y2)-(x2)*(y3)-(x3)*(y1)-(x1)*(y3)-(x3)*(y2)-(x2)*(y1))/2;
    System.out.println("El "+ TypeTriangle+" su area es de "+(Math.abs(Area)));
    
    
    }
        
        
        
        
 }
    

