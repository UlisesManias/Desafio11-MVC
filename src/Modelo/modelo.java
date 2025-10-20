/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modelo;

/**
 *
 * @author Alumno
 */
public class modelo {

    /**
     * @param args the command line arguments
     */
   
   public int celsiusAFarenheit(int celsius){
       return (celsius * 9/5) + 32;
   }
    
   public int farenheitACelsius(int farenheit){
       return (farenheit - 32) * 5/9;
   }
}
