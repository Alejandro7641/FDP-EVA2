/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_27_cuenta;

import java.util.Scanner;

/**
 *
 * @author alexn
 */
public class EVA2_27_CUENTA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner capturar = new Scanner(System.in);
       int saldo,monto;
       saldo=1000000;
       while(saldo>0){
       System.out.println("cuanto deseas retirar");
       monto=capturar.nextInt();
       saldo=saldo-monto;
       System.out.println("saldo actual "+saldo);
       }
       if(saldo==0){
       System.out.println("no queda saldo en la cuenta");
       }
       else{
       System.out.println("estas en numeros rojos");
       }
    }
    
}
