/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_for;

import java.util.Scanner;

/**
 *
 * @author alexn
 */
public class EVA2_10_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i = 1; i<=20; i++)
        System.out.print(i+" - ");
        System.out.println("");
        for(int i = 0; i<=100; i+=2)
        System.out.print(i+" - ");
        System.out.println("");
        for(int i = 100; i>=0; i-=2)
        System.out.print(i+" - ");
        System.out.println("");
        for(int i = -70; i<=70; i+=7)
        System.out.print(i+" - ");
        System.out.println("");
        for(int i = 70; i>=-70; i-=7)
        System.out.print(i+" - ");
        System.out.println("");
        Scanner capturar = new Scanner (System.in);
        int tabla;
        System.out.println("elige una tabla de multiplicar");
        tabla=capturar.nextInt();
        for(int i = tabla; i<=(tabla*10); i+=tabla){
        System.out.print(i+" - ");
        }
    }
    
}
