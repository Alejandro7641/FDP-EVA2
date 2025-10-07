/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_tabla_mult;

import java.util.Scanner;

/**
 *
 * @author alexn
 */
public class EVA2_12_TABLA_MULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner capturar = new Scanner (System.in);
        int tabla, resi;
        System.out.println("elige una tabla de multiplicar");
        tabla=capturar.nextInt();
        for(int i = tabla; i<=(tabla*10); i+=tabla){
        resi=i/tabla;
        System.out.println(tabla+" x "+resi+" = "+i);
        }
    }
    
}
