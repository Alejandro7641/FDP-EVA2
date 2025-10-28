/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_do_while;

import java.util.Scanner;

/**
 *
 * @author alexn
 */
public class EVA2_19_DO_WHILE {
    final static String USUARIO = "admin";
    final static String CONTRASEÑA = "admin";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String usu, con;
        Scanner capt = new Scanner (System.in);
        do{
        System.out.println("usuario:");
        usu=capt.nextLine();
        System.out.println("contraseña:");
        con=capt.nextLine();
        }while(!(usu.equals(USUARIO)&&con.equals(CONTRASEÑA)));
                System.out.println("Acceso consedido. bienvenido al sistema");
    }
}
