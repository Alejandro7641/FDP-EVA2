/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_26_factorial;

import java.util.Scanner;

/**
 *
 * @author alexn
 */
public class EVA2_26_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner capturar = new Scanner (System.in);
        int numero,resultad,factorial=1;
        System.out.println("di un numero");
        numero=capturar.nextInt();
        int arreglo[]=new int [numero];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i]=i+1;
            factorial=factorial*arreglo[i];
        }
        System.out.println(factorial);
    }
}
