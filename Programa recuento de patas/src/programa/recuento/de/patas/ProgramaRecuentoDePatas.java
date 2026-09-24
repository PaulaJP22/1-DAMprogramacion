/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa.recuento.de.patas;
import java.util.Scanner;

/**
 *
 * @author Alumno Tarde
 */
public class ProgramaRecuentoDePatas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int hormigas,arañas,cochinillas,totalPatas;
       
       Scanner sc = new Scanner(System.in);
       
        System.out.println("¿Cuantas hormigas has capturado?");
        hormigas = sc.nextInt();
       
        System.out.println("¿Cuantas arañas has capturado?");
        arañas = sc.nextInt();
       
        System.out.println("¿Cuantas cochinillas has capturado?");
        cochinillas = sc.nextInt();
        
       
        
        totalPatas = hormigas*6 + arañas*8 + cochinillas*14;
        System.out.println("Las patas son: " + totalPatas );
      
                
    }
    
}
