/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_switch;

/**
 *
 * @author alexn
 */
public class EVA3_3_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cade="lunes";
        switch(cade){
               case "lunes":
                   System.out.println(1);
                  break;
                    case "martes":
                        System.out.println(2);
                  break;
                  default:
                      System.out.println("Dia no existente");
           }
    }
    
}
