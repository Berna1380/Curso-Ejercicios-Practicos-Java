/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangle;

/**
 *
 * @author ByPag
 */
public class IsoscelesTriangle {
    //Atributo//
    public String TypeTriangle;
    public float LadosIguales;
    public float Perimetro;
    public float LadoDesigual;
    public float Area;
    
     //Constructor//
    public IsoscelesTriangle(String TypeTriangle, float LadosIguales) {
        this.TypeTriangle = TypeTriangle;
        this.LadosIguales = LadosIguales;
    }
    
    //Sobrecarga de Metodos//
    //Metodo Constructor//
    public void Perimetro(float LadoSimilar,float LadoDesigual) {
    this.LadoDesigual=LadoDesigual;
    Perimetro = (LadoSimilar*LadosIguales)+(LadoDesigual);
}
    //Metodo Simple//
    public void Area(float Altura) {
    Area= (Altura*LadoDesigual)/2;
    System.out.println("El "+ TypeTriangle+" su perimetro es de "+Perimetro);
    System.out.println("El "+ TypeTriangle+" su area es de "+Area);
    }
    
    
            }
    
