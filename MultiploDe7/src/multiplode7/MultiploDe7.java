/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplode7;
import java.util.Scanner;

/**
 *
 * @author Alumno Tarde
 */
public class MultiploDe7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int numeroEntero, suma;
     
     Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número entero: ");
        numeroEntero = sc.nextInt();
        suma = (7 - numeroEntero) % 7;
        
    System.out.println("A tu número" + numeroEntero + " deberías sumarle: " + suma);
        
    }
    
}
