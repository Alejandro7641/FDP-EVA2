/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_switch;

import java.util.Scanner;

/**
 *
 * @author alexn
 */
public class EVA2_2_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner capturar = new Scanner (System.in);
        int saldo=5000, pin, opcion, monto, calculo;
        System.out.println("introduce el pin");
        pin=capturar.nextInt();
        System.out.println("1.consultar saldo");
           System.out.println("2.retirar monto");
           System.out.println("3.depositar monto");
           System.out.println("selecciona la opcion");
           opcion=capturar.nextInt();
           switch(opcion){
               case 1:
                   System.out.println("elegiste consultar el saldo");
                  break;
                    case 2:
                        System.out.println("elegiste retirar saldo");
                  break;
                  case 3:
                      System.out.println("elegiste depositar saldo");
                  break;
                  default:
                      System.out.println("opcion incorrecta");
           }
    }
}
