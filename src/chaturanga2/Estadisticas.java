/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chaturanga2;

import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Estadisticas {
    
   public int regresar;
   
    
    public static String estadistica[]={" "," "," "," "," "," "," "," "," "," "};
    
    
   
       
       public void STATS(){
           
           Scanner leo=new Scanner(System.in);
           
           
           System.out.println("");
           System.out.println("");
           
           System.out.print("Para regresar al menu principal ingrese el digito 1:");
           regresar=leo.nextInt();
           
           switch(regresar){
               
               case 1:
                   
                Menu.Menu();
                   
               default:
                   
                 System.out.println("");
                System.out.println("");
                   System.out.println("                   <<<<Resultados de los ultimos 10 juegos >>>>");
                System.out.println("");
                
               for(int i=0;i < 10;i++){
                 System.out.print(i+1 );
                 System.out.print("--");
                 System.out.println( Estadisticas.estadistica[i]);
                 System.out.println("");
             }
             
                STATS();
           
           }
           
           
           
           
           
           
       }
       
   
    


}
