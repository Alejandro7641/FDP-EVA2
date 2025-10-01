/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_exa1;

import java.util.Scanner;

/**
 *
 * @author alexn
 */
public class EVA2_1_EXA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner capturar = new Scanner (System.in);
        int saldo=5000;
        int pin, opcion, monto, calculo;
        System.out.println("introduce el pin");
        pin=capturar.nextInt();
        if(pin==1234){
           System.out.println("1.consultar saldo");
           System.out.println("2.retirar monto");
           System.out.println("3.depositar monto");
           System.out.println("selecciona la opcion");
           opcion=capturar.nextInt();
           if(opcion==1){
         System.out.println("tu saldo es"+saldo);   
        }
           else if(opcion==2){
         System.out.println("cuanto vas a retirar"); 
         monto=capturar.nextInt();
         if(opcion<=saldo){
             calculo=saldo-monto;
         System.out.println("tu saldo es "+ calculo);   
        }
         else{
         System.out.println("monto mayor al saldo");   
        }
        }
           else if(opcion==3){
         System.out.println("cuanto vas a depositar"); 
         monto=capturar.nextInt();
         if(opcion>=0){
             calculo=saldo+monto;
         System.out.println("tu saldo es "+ calculo);   
        }
         else{
         System.out.println("monto negativo");   
        }  
        }
        }
        else{
         System.out.println("pin incorrecto");   
        }
    }
    
}
