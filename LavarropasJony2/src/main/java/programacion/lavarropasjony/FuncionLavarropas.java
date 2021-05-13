/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion.lavarropasjony;

/**
 *
 * @author jonathan
 */
import java.util.Scanner;
public class FuncionLavarropas {
    //aplico el encapsulamiento con modificadores de acceso
       private int kilos ;
       private String marca;
       private String modelo;
       
       //creo el metodo constructor
       public FuncionLavarropas(){
       
           kilos = 5;
           marca = "LG";
           modelo = "Logic Tech V1";
       
       }
       
       //creo el metodo tipo de ropas
       public void TipoDeRopa(){
           System.out.print("Eleija el tipo de lavado: ");
           System.out.println("1_Lana \n 2_Ropa Sucia \n 3_Economico \n 4_Ropa de Bebé ");
           
           Scanner entrada = new Scanner(System.in);
           int seleccion = entrada.nextInt();
           switch(seleccion){
               case 1:
                   System.out.println("Lana");
               break;
               case 2:
                   System.out.println("Ropa Sucia");
               break;
               case 3:
                   System.out.println("Economico");
               break;
               default:
                   System.out.println("Ropa de Bebé");
       
       
            }
       
       }
    
}
