/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_arreglos_string_2;

import java.util.Scanner;

/**
 *
 * @author alexn
 */
public class EVA2_6_ARREGLOS_STRING_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner capturar = new Scanner (System.in);
        String diadelasemana[] = {"domingo", "lunes", "martes", "miercoles", "jueves", "viernes", "sabado"};
        int dia;
        System.out.println("selecciona un dia en numero (0-6)");
       dia=capturar.nextInt();
       System.out.println("el dia es "+diadelasemana[dia]);
    }
    
}
