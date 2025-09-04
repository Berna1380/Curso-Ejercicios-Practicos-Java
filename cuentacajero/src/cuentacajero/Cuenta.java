/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentacajero;

/**
 *
 * @author ByPag
 */
public class Cuenta {
    //Atributo//
    private String titular;
    private double cantidad;
    
    //Constructores//
public Cuenta (String titular){
    this(titular, 0);//Sobrecarga //    
}
public Cuenta (String titular, double cantidad){
this.titular=titular; 
if(cantidad<0){
this.cantidad=0;
}else{
this.cantidad=cantidad;
}

}    
//Metodos//
public String gettitular(){
return titular;
}
public void settitular(){
this.titular=titular;
}

public double getcantidad(){
return cantidad;
}
public void setcantidad(){
this.cantidad=cantidad;  
}

public void ingresar (double cantidad){
if(cantidad>0){
    this.cantidad += cantidad;
}
}
public void retirar(double cantidad){
if(this.cantidad-cantidad<0){
this.cantidad=0;
} else {
    this.cantidad-=cantidad;
} 

}
public String toString(){
return "El titular "+ titular+" tiene "+ cantidad +" euros en tu cuenta"; 



}
}
