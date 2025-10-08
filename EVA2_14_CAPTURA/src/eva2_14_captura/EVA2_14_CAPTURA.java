/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_captura;

import java.util.Scanner;

/**
 *
 * @author alexn
 */
public class EVA2_14_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner capturar = new Scanner (System.in);
        int cantidad;
        System.out.println("cauntas calificaciones va a capturar?");
        cantidad=capturar.nextInt();
        int arreglo[]=new int [cantidad];
        for(int i=0; i<arreglo.length;i++){
         System.out.println("calificacion "+(i+1)+":");
         arreglo[i]=capturar.nextInt();
        }
        for(int i=0; i<arreglo.length;i++){
        System.out.print("["+arreglo[i]+"]");
    }
    
}}
