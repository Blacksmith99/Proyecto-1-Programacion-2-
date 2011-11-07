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
public class Tablero {
    
    public static boolean turno=true;
    public static String Tablero[][]={{"TV","CV","EV","RV","VV","EV","CV","TV"},{"PV","PV","PV","PV","PV","PV","PV","PV"},{"--","--","--","--","--","--","--","--"},{"--","--","--","--","--","--","--","--"}, {"--","--","--","--","--","--","--","--"},{"--","--","--","--","--","--","--","--"},{"PR","PR","PR","PR","PR","PR","PR","PR"},{"TR","CR","ER","VR","RR","ER","CR","TR"}};
    public static int contRojos=0;
    public static int contVerdes=0;
    
    
    
    
    
    
    
    
    
    public static void ImprimirTablero(){
          Scanner lea=new Scanner(System.in);
          
          
         
          
          
          
          System.out.println("");
          System.out.print("                                  " + "Verdes:" + contVerdes );
          System.out.print("                                  " +  "Rojos:"+ contRojos);
          System.out.println("");
          System.out.println("");
          System.out.println("");
        
          
          
          System.out.print("      ");
          System.out.println("   1    2    3    4    5    6    7    8" );
         
          for(int y=0; y< 8;y++){
             
             System.out.print("      ");
              System.out.print(y+1);
             for(int x=0; x< 8;x++){
                 System.out.print(" ");
                 System.out.print(" ");
                 System.out.print(Tablero[y][x]);
                 System.out.print(" ");
             }
             System.out.print("\n");
             System.out.print("\n");
         }
         System.out.println("Para retirarse ingrese -1 en la fila y columna");
          System.out.println("");
          System.out.println("");
          
          System.out.print("Ingrese la posicion de la fila de la ficha que desea mover:");
          int f1=lea.nextInt();
          System.out.println("");
          System.out.print("Ingrese la posicion de la columna de la ficha que desea mover:");
          int col1=lea.nextInt();
          
         
          if(f1 == -1 && col1 ==-1){
              
              
              char opcion;
              System.out.println("\n");
              System.out.print("Esta seguro(a) que desea retirarse(S/N):");
              opcion=lea.next().charAt(0);
             
             if(opcion=='s'||opcion=='S'){ 
              
              Rey.MovimientoenLdelRojo=true;
              Rey.MovimientoenLdelVerde=true;
              Menu.validar=0;
              contRojos=0;
              contVerdes=0;
              Tablero[0][0]="TV"; Tablero[0][1]="CV"; Tablero[0][2]="EV"; Tablero[0][3]="RV"; Tablero[0][4]="VV"; Tablero[0][5]="EV"; Tablero[0][6]="CV"; Tablero[0][7]="TV";
              Tablero[1][0]="PV"; Tablero[1][1]="PV"; Tablero[1][2]="PV"; Tablero[1][3]="PV"; Tablero[1][4]="PV"; Tablero[1][5]="PV"; Tablero[1][6]="PV"; Tablero[1][7]="PV"; 
              Tablero[2][0]="--"; Tablero[2][1]="--"; Tablero[2][2]="--"; Tablero[2][3]="--"; Tablero[2][4]="--"; Tablero[2][5]="--"; Tablero[2][6]="--"; Tablero[2][7]="--";
              Tablero[3][0]="--"; Tablero[3][1]="--"; Tablero[3][2]="--"; Tablero[3][3]="--"; Tablero[3][4]="--"; Tablero[3][5]="--"; Tablero[3][6]="--"; Tablero[3][7]="--";
              Tablero[4][0]="--"; Tablero[4][1]="--"; Tablero[4][2]="--"; Tablero[4][3]="--"; Tablero[4][4]="--"; Tablero[4][5]="--"; Tablero[4][6]="--"; Tablero[4][7]="--";
              Tablero[5][0]="--"; Tablero[5][1]="--"; Tablero[5][2]="--"; Tablero[5][3]="--"; Tablero[5][4]="--"; Tablero[5][5]="--"; Tablero[5][6]="--"; Tablero[5][7]="--";
              Tablero[6][0]="PR"; Tablero[6][1]="PR"; Tablero[6][2]="PR"; Tablero[6][3]="PR"; Tablero[6][4]="PR"; Tablero[6][5]="PR"; Tablero[6][6]="PR"; Tablero[6][7]="PR"; 
              Tablero[7][0]="TR"; Tablero[7][1]="CR"; Tablero[7][2]="ER"; Tablero[7][3]="VR"; Tablero[7][4]="RR"; Tablero[7][5]="ER"; Tablero[7][6]="CR"; Tablero[7][7]="TR";
             
              if(turno){
                  
               
                  System.out.print("\n");
                  System.out.print("\n");
                  System.out.print("                          ");
                  System.out.println(" ¡¡¡¡ El JUGADOR 2(VERDES): " + Menu.j2 +" "+ " HA ¡VENCIDO! DADO QUE " + " EL JUGADOR 1(ROJOS): "  + Menu.j1 +" "+" SE HA RETIRADO DE LA PARTIDA !!!!");
                 
                  Estadisticas.estadistica[9]= Estadisticas.estadistica[8];
                  Estadisticas.estadistica[8]=Estadisticas.estadistica[7];
                  Estadisticas.estadistica[7]=Estadisticas.estadistica[6];
                  Estadisticas.estadistica[6]=Estadisticas.estadistica[5];
                  Estadisticas.estadistica[5]=Estadisticas.estadistica[4];
                  Estadisticas.estadistica[4]=Estadisticas.estadistica[3];
                  Estadisticas.estadistica[3]=Estadisticas.estadistica[2];
                  Estadisticas.estadistica[2]=Estadisticas.estadistica[1];
                  Estadisticas.estadistica[1]=Estadisticas.estadistica[0];
                  Estadisticas.estadistica[0]=Menu.j2+ " ha ganado la partida porque "+Menu.j1+" se retiro del juego";
                  
                  
                  
                  
                  Menu.Menu();
                  System.out.print("\n");
                  System.out.print("\n");
                   
              
              
                  
              }else{
                  
                  
              Menu.validar=0;
              contRojos=0;
              contVerdes=0;
              Tablero[0][0]="TV"; Tablero[0][1]="CV"; Tablero[0][2]="EV"; Tablero[0][3]="RV"; Tablero[0][4]="VV"; Tablero[0][5]="EV"; Tablero[0][6]="CV"; Tablero[0][7]="TV";
              Tablero[1][0]="PV"; Tablero[1][1]="PV"; Tablero[1][2]="PV"; Tablero[1][3]="PV"; Tablero[1][4]="PV"; Tablero[1][5]="PV"; Tablero[1][6]="PV"; Tablero[1][7]="PV"; 
              Tablero[2][0]="--"; Tablero[2][1]="--"; Tablero[2][2]="--"; Tablero[2][3]="--"; Tablero[2][4]="--"; Tablero[2][5]="--"; Tablero[2][6]="--"; Tablero[2][7]="--";
              Tablero[3][0]="--"; Tablero[3][1]="--"; Tablero[3][2]="--"; Tablero[3][3]="--"; Tablero[3][4]="--"; Tablero[3][5]="--"; Tablero[3][6]="--"; Tablero[3][7]="--";
              Tablero[4][0]="--"; Tablero[4][1]="--"; Tablero[4][2]="--"; Tablero[4][3]="--"; Tablero[4][4]="--"; Tablero[4][5]="--"; Tablero[4][6]="--"; Tablero[4][7]="--";
              Tablero[5][0]="--"; Tablero[5][1]="--"; Tablero[5][2]="--"; Tablero[5][3]="--"; Tablero[5][4]="--"; Tablero[5][5]="--"; Tablero[5][6]="--"; Tablero[5][7]="--";
              Tablero[6][0]="PR"; Tablero[6][1]="PR"; Tablero[6][2]="PR"; Tablero[6][3]="PR"; Tablero[6][4]="PR"; Tablero[6][5]="PR"; Tablero[6][6]="PR"; Tablero[6][7]="PR"; 
              Tablero[7][0]="TR"; Tablero[7][1]="CR"; Tablero[7][2]="ER"; Tablero[7][3]="VR"; Tablero[7][4]="RR"; Tablero[7][5]="ER"; Tablero[7][6]="CR"; Tablero[7][7]="TR";
                  
                  
                  System.out.print("\n");
                  System.out.print("\n");
                  System.out.print("                           ");
                  System.out.println(" ¡¡¡¡ EL JUGADOR 1(ROJOS): " + Menu.j1 +"  " + "HA ¡VENCIDO! DADO QUE " + " EL JUGADOR 2(VERDES): " + Menu.j2+ " " +" SE HA RETIRADO DE LA PARTIDA !!!!"); 
                  
                 
                  
                  Estadisticas.estadistica[9]= Estadisticas.estadistica[8];
                  Estadisticas.estadistica[8]=Estadisticas.estadistica[7];
                  Estadisticas.estadistica[7]=Estadisticas.estadistica[6];
                  Estadisticas.estadistica[6]=Estadisticas.estadistica[5];
                  Estadisticas.estadistica[5]=Estadisticas.estadistica[4];
                  Estadisticas.estadistica[4]=Estadisticas.estadistica[3];
                  Estadisticas.estadistica[3]=Estadisticas.estadistica[2];
                  Estadisticas.estadistica[2]=Estadisticas.estadistica[1];
                  Estadisticas.estadistica[1]=Estadisticas.estadistica[0];
                  Estadisticas.estadistica[0]= Menu.j1+ " ha ganado la partida porque "+Menu.j2+" se retiro del juego";
                  
                  Menu.Menu();
                  System.out.print("\n");
                  System.out.print("\n");
              }
              
          }else if(opcion=='n'||opcion=='N'){
                 System.out.println("");
                 System.out.println("");
                 System.out.println("Usted sigue en juego!!!");
              ImprimirTablero();
          }
          }
    
          if((f1-1 > 8) || (col1-1 > 8) || (f1 == 0) || (col1 ==0) || (f1<-1) || (col1 < -1)){
              System.out.println("");
              System.out.println("");
              System.out.println("Coordenadas incorrectas!!");
              ImprimirTablero();
          }
          
          if(Tablero[f1-1][col1-1].equals("--")){
              System.out.println("");
              System.out.println("");
              System.out.println("No hay ninguna ficha en esta posicion !!");
              ImprimirTablero();
          }
          
          
          
          if(turno){
              
          if(Tablero[f1-1][col1-1].charAt(1) == 'R'){
          
         
              System.out.print("\n");
              System.out.print("Ingrese la posicion de la fila hacia la que desea mover su ficha:");
              int fila2=lea.nextInt();
              System.out.print("\n");
              System.out.print("Ingresa la posicion de la columna hacia la cual desea mover su pieza:");
              int columna2=lea.nextInt();
              System.out.print("\n");
              
              if(Tablero[f1-1][col1-1].charAt(0) == 'C'){
              
              Ficha fich= new Caballo(0,0);
              Caballo cab=(Caballo)fich;
              cab.Mover(f1-1,col1-1,fila2-1,columna2-1);
           }else if(Tablero [f1-1][col1-1].charAt(0) == 'T'){
              
              Ficha fo=new Torre(0,0);
              Torre tor=(Torre)fo;
              tor.Mover(f1-1,col1-1,fila2-1,columna2-1);
              
          }else if(Tablero [f1-1][col1-1].charAt(0) == 'E'){
              
              Ficha g=new Elefante(0,0);
              Elefante ele=(Elefante)g;
              ele.Mover(f1-1,col1-1,fila2-1,columna2-1);
          }else if(Tablero [f1-1][col1-1].charAt(0) == 'R'){
              
              Ficha t=new Rey(0,0);
              Rey re=(Rey)t;
              re.Mover(f1-1,col1-1,fila2-1,columna2-1);
          }else if(Tablero [f1-1][col1-1].charAt(0) == 'V'){
              
              Ficha jj=new Visir(0,0);
              Visir vi=(Visir)jj;
              vi.Mover(f1-1, col1-1,fila2-1,columna2-1);
          }else if(Tablero [f1-1][col1-1].charAt(0) == 'P'){
              
              Ficha pie=new Peon(0,0);
              Peon peo=(Peon)pie;
              peo.Mover(f1-1,col1-1, fila2-1, columna2-1);
          }
              
              
              
          
          
          
          
          }else{
              System.out.println("");
              System.out.println("");
              System.out.println("Es el turno del jugador ROJO !!");
              ImprimirTablero();
            
          }
          
          }else if(!turno){
              
              if((f1-1 > 8) || (col1-1 > 8) || (f1 == 0) || (col1 ==0) || (f1<-1) || (col1 < -1)){
                  System.out.println("");
                  System.out.println("");
                  System.out.println("Coordenadas incorrectas !!!");
                  ImprimirTablero();
              }
              
              if(Tablero[f1-1][col1-1].charAt(1)== 'V'){
                  
                  
              System.out.print("\n");
              System.out.print("Ingrese la posicion de la fila hacia la que desea mover su ficha:");
              int fila2=lea.nextInt();
              System.out.print("\n");
              System.out.print("Ingresa la posicion de la columna hacia la cual desea mover su pieza:");
              int columna2=lea.nextInt();
              System.out.print("\n");
              
              
              if(Tablero[f1-1][col1-1].charAt(0) == 'C'){
              
              Ficha fich= new Caballo(0,0);
              Caballo cab=(Caballo)fich;
              cab.Mover(f1-1,col1-1,fila2-1,columna2-1);
           }else if(Tablero [f1-1][col1-1].charAt(0) == 'T'){
              
              Ficha fo=new Torre(0,0);
              Torre tor=(Torre)fo;
              tor.Mover(f1-1,col1-1,fila2-1,columna2-1);
              
          }else if(Tablero [f1-1][col1-1].charAt(0) == 'E'){
              
              Ficha g=new Elefante(0,0);
              Elefante ele=(Elefante)g;
              ele.Mover(f1-1,col1-1,fila2-1,columna2-1);
          }else if(Tablero [f1-1][col1-1].charAt(0) == 'R'){
              
              Ficha t=new Rey(0,0);
              Rey re=(Rey)t;
              re.Mover(f1-1,col1-1,fila2-1,columna2-1);
          }else if(Tablero[f1-1][col1-1].charAt(0) == 'V'){
              
              Ficha jj=new Visir(0,0);
              Visir vi=(Visir)jj;
              vi.Mover(f1-1, col1-1,fila2-1,columna2-1);
          }else if(Tablero[f1-1][col1-1].charAt(0) == 'P'){
              
              Ficha pie=new Peon(0,0);
              Peon peo=(Peon)pie;
              peo.Mover(f1-1,col1-1, fila2-1, columna2-1);
          }
          
                  
                  
              }else{
                System.out.println("");
                System.out.println("");
                System.out.println(" Es el turno del jugador VERDE !!!");
                ImprimirTablero();
                
              }
              
             
          }
          
          
        }
    
    
    
    
    
    
      
    
}

