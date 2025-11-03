/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_triangulo;

import java.util.Scanner;

/**
 *
 * @author alexn
 */
public class EVA2_24_TRIANGULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner (System.in);
        int valor;
        String texto="*";
        System.out.println("ingresa un numero");
        valor=captu.nextInt();
        for (int i = 1; i <= valor; i++) {
            for (int j = 1; j <= i; j++) {
            System.out.print(texto);
        }
            System.out.println();
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
    }
    
}
