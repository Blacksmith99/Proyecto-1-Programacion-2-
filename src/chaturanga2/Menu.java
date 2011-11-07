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
public class Menu {
    
    
    public static String j1;
    public static String j2;
    public static int validar=0;
    public static int a=0;
    public static void  IngresarJugadores(){
        
        Scanner lea=new  Scanner(System.in);
        
      
        System.out.print("\n");
        System.out.print("Ingrese el nombre del jugador 1 (Fichas Rojas):");
         j1=lea.next();
      
        System.out.print("\n");
        System.out.print("Ingrese el nombre del jugador 2 (Fichas Verdes):");
        j2=lea.next();
        System.out.print("\n");
    }
    
    
    public static void Menu(){
        Scanner lea=new Scanner(System.in);
       while(a==0){
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("                                   ***************************************************************");
        System.out.println("                                   **********               CHATURANGA                  **********");
        System.out.println("                                   ***************************************************************");
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("                                                           MENU PRINCIPAL                ");
        System.out.print("\n");
        System.out.print("\n");
        System.out.println("                                                 1)-JUGAR CHATURANGA !");
        System.out.println("                                                 2)-ESTADISTICAS DE JUEGOS");
        System.out.println("                                                 3)-SALIR");
        System.out.println("");
        System.out.print("                                                   Elija una opcion:");
        int op=lea.nextInt();
       
        switch(op){
            
            case 1:
             
                if(validar==0){
             IngresarJugadores();
             validar++;
                }
             
                Tablero.ImprimirTablero();
                break;
           
            
            
            case 2:
                
             Estadisticas est=new Estadisticas();
             
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
             
               est.STATS();
           
                
            
            break;
           
            
            case 3:
                System.out.println("\n");
                System.out.println("\n");
                System.out.println("\n");
                System.out.println("\n");
                
                System.out.println("                              ¡¡¡GRACIAS POR HABER JUGADO AJEDREZ CHATURANGA 1.0!!!");
                System.out.println("\n");
                System.exit(0);
            
            
                
            default:
                
                System.out.println("\n");
                System.out.println("                               LA OPCION INGRESADA ES INCORRECTA!INTENTE OTRA VEZ!!!");
                System.out.println("\n");
                break;
        }
        
        
        
        }
    
}
}
