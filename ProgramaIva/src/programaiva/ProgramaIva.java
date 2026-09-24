/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaiva;

import java.util.Scanner;

/**
 *
 * @author Alumno Tarde
 */
public class ProgramaIva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Programa que pide al usuario base imponible e IVA y muestra el importe
    //de IVA y el total
     
   double baseImponible, iva, importeIva, importeTotal;
   
   Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca la base imponible: ");
        baseImponible = scan.nextDouble();
        
        System.out.println("Introduzca el % de IVA: ");
        iva = scan.nextDouble();
        
        importeIva = baseImponible*iva/100;
        importeTotal = baseImponible + importeIva;
        
        System.out.println("Importe del IVA: " + importeIva);
        System.out.println("Importe total:" + importeTotal);
        
        
        
    }
    
}
