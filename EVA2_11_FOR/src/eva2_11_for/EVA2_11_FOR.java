/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_for;

import java.util.Scanner;

/**
 *
 * @author alexn
 */
public class EVA2_11_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ini, fin, resi;
        Scanner capturar = new Scanner (System.in);
        System.out.print("cual es el numero incial");
        ini=capturar.nextInt();
        System.out.print("cual es el numero final");
        fin=capturar.nextInt();
        for(int i = ini; i<=fin; i++){
            resi=i%2;
            if(resi==0)
            System.out.print(i+" - ");
        }
    }
    
}
