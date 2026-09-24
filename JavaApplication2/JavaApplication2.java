/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author Alumno Tarde
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        String mayorEdad;
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Introduzca la edad");
        
        edad = sc.nextInt();
        
       
        
        mayorEdad = edad >= 18 ? "Si" : "No";
        
        System.out.println("¿Es mayor de edad? " + mayorEdad);
    }
    
}
