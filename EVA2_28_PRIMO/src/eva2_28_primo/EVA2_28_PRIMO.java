/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_28_primo;

import java.util.Scanner;

/**
 *
 * @author alexn
 */
public class EVA2_28_PRIMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner capturar = new Scanner(System.in);
        int numero;
        boolean primo=true;
        System.out.print("di un numero ");
        numero = capturar.nextInt();
        for (int i=2; i<numero; i++) {
        if (numero%i==0) {
        primo = false;
            }
        }
        if (primo) {
            System.out.println(numero + " es primo");
        } else {
            System.out.println(numero + " no es primo");
        }
    }
    
}
