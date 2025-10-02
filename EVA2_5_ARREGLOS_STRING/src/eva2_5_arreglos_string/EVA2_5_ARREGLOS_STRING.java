/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_arreglos_string;

import java.util.Scanner;

/**
 *
 * @author alexn
 */
public class EVA2_5_ARREGLOS_STRING {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner capturar = new Scanner (System.in);
        String diadelasemana[] = new String [7];
        int dia;
        diadelasemana[0]="domingo";
        diadelasemana[1]="lunes";
        diadelasemana[2]="martes";
        diadelasemana[3]="miercoles";
        diadelasemana[4]="jueves";
        diadelasemana[5]="viernes";
        diadelasemana[6]="sabado";
        System.out.println("selecciona un dia en numero (0-6)");
       dia=capturar.nextInt();
       System.out.println("el dia es "+diadelasemana[dia]);
    }
    
}
