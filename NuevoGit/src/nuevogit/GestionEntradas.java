/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nuevogit;
import java.util.Scanner;

/**
 *
 * @author Alumno Tarde
 */
public class GestionEntradas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int nAdulto,nInfantil;
      double totalEntrada;
       Scanner sc = new Scanner(System.in);
       
        System.out.println("¿Cuantas entradas de adultos se compraron?");
        nAdulto = sc.nextInt();
        
        System.out.println("¿Cuantas entradas infantiles se compraon?");
        nInfantil = sc.nextInt();
        
        final double entradaAdulto = 20;
        final double entradaInfantil = 15.50;
        
        totalEntrada = nAdulto*entradaAdulto + nInfantil*entradaInfantil;
        
        System.out.println("El total de la compra es: " );
        
        
      
    
    
        
    }
    
}
