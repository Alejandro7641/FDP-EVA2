/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_29_contra_for;

import java.util.Scanner;

/**
 *
 * @author alexn
 */
public class EVA2_29_CONTRA_FOR {
    final static String CONTRASEÑA = "admin";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String con;
        Scanner capt = new Scanner (System.in);
        for(int i = 1; i <= 4; i++){
        System.out.println("contraseña:");
        con=capt.nextLine();
        if(con.equals(CONTRASEÑA)){
             System.out.println("Acceso consedido. bienvenido al sistema");
             break;
        }
        if(i==4){
            System.out.println("limite de intentos alcansado");
        }
        }
   
    }
    
}