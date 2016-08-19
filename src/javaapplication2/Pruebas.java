/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.io.IOException;

/**
 *
 * @author aulaf209
 */
public class Pruebas {
    
    @Test /*Prueba01*/
   
    public void NumeroNoNegativo  ()    {
        Romano romano = new Romano();
        if (romano.numeroIngresado <1){
            System.out.println("el numero ingresado tiene que ser entero mayor a 1");
        }
    }


     @Test /*Prueba02*/
    public void NumeroNoDecimal () {
       
       Metodos metodos = new Metodos();
        if (metodos.esDecimal=true ){
            System.out.println("el numero ingresado es decimal, ingrese numeros enteros");
        }
        
    }
    
   /* public boolean esDecimal(String cad)
 {
 try
 {
   Double.parseDouble(cad);
   return true;
 }
 catch(NumberFormatException nfe)
 {
   return false;
 }
 }*/
    
    
     @Test /*Prueba03*/
    public void NoEntrenLetra () {
        Metodos metodos=new Metodos ();
        if (metodos.esLetra=false){
            System.out.println("el numero que ingreso contiene alguna letra o caracter, digite un numero entero");
        }
    }
    
    @Test
      public void ToDoNumeroNoEsCero(){
         
    }
     @Test
     public void ToDoNumeroRomanoBase(){ 
         
     }
     
     /* 
    private static boolean esLetra(String cadena){
	try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
}
   
    }
}