/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chaturanga2;

/**
 *
 * @author Josue
 */
public class Elefante extends Ficha {
    
    public Elefante(int d,int c){
        
         super(d,c);
        
        
    }
    
    
    
    @Override
    public void Mover(int fila1, int columna1,int fila2, int columna2){
        
        
        if(Tablero.turno){
            
            if(((fila2 <8) && (columna2 <8)) && (Tablero.Tablero[fila2][columna2].equals("--") || Tablero.Tablero[fila2][columna2].charAt(1) != 'R') && (((fila2 == fila1 -2) && (columna2 == columna1 -2)) || ((fila2 == fila1-2) && (columna2 == columna1 +2)) || ((fila2 == fila1 +2) && (columna2 == columna1 -2)) || ((( fila2 == fila1 +2) && (columna2 == columna1 +2)) ))){
        
               if(Tablero.Tablero[fila2][columna2].charAt(1) != 'R' && (Tablero.Tablero[fila2][columna2].charAt(0) == 'P' || Tablero.Tablero[fila2][columna2].charAt(0) == 'T' || Tablero.Tablero[fila2][columna2].charAt(0) == 'C' || Tablero.Tablero[fila2][columna2].charAt(0) == 'E' || Tablero.Tablero[fila2][columna2].charAt(0) == 'V' || Tablero.Tablero[fila2][columna2].charAt(0) == 'R')){
             
             
             if(Tablero.Tablero[fila2][columna2].charAt(0)== 'P'){
                          System.out.println("El Elefante de "+Menu.j1+" se ha comido al Peon de "+Menu.j2+" ");
                      }else if(Tablero.Tablero[fila2][columna2].charAt(0)=='T'){
                          System.out.println("El Elefante de "+Menu.j1+" se ha comido a la Torre de "+Menu.j2+" ");
                      }else if(Tablero.Tablero[fila2][columna2].charAt(0) == 'C'){
                          System.out.println("El Elefante de "+Menu.j1+" se ha comido al Caballo de "+Menu.j2+" ");
                      }else if(Tablero.Tablero[fila2][columna2].charAt(0) == 'E'){
                          System.out.println("El Elefante de "+Menu.j1+" se ha comido al Elefante de "+Menu.j2+" ");
                      }else if(Tablero.Tablero [fila2][columna2].charAt(0) == 'V'){
                          System.out.println("El Elefante de "+Menu.j1+" se ha comido al Visir de "+Menu.j2+" ");
                      }else if(Tablero.Tablero [fila2][columna2].charAt(0) == 'R'){
                          
                            System.out.println("");
                            System.out.println("");
                            System.out.println(" EL JUGADOR 1(ROJOS): "+Menu.j1+ " HA ¡TRIUNFADO! SE COMIO AL REY Y " +Tablero.contRojos+ " PIEZAS MAS DEL JUGADOR 2(VERDES): "+ Menu.j2);
                            System.out.println("");
                            
                            
                            Estadisticas.estadistica[9]=Estadisticas.estadistica[8];
                  Estadisticas.estadistica[8]=Estadisticas.estadistica[7];
                  Estadisticas.estadistica[7]=Estadisticas.estadistica[6];
                  Estadisticas.estadistica[6]=Estadisticas.estadistica[5];
                  Estadisticas.estadistica[5]=Estadisticas.estadistica[4];
                  Estadisticas.estadistica[4]=Estadisticas.estadistica[3];
                  Estadisticas.estadistica[3]=Estadisticas.estadistica[2];
                  Estadisticas.estadistica[2]=Estadisticas.estadistica[1];
                  Estadisticas.estadistica[1]=Estadisticas.estadistica[0];
                  Estadisticas.estadistica[0]=Menu.j1+ " ha ganado la partida porque le comio al Rey y "+ Tablero.contRojos+" piezas mas a "+Menu.j2+" ";
                  
                  
                  
                            Tablero.contRojos=0;
                            Tablero.contVerdes=0;
              Tablero.Tablero[0][0]="TV"; Tablero.Tablero[0][1]="CV"; Tablero.Tablero[0][2]="EV"; Tablero.Tablero[0][3]="RV"; Tablero.Tablero[0][4]="VV"; Tablero.Tablero[0][5]="EV"; Tablero.Tablero[0][6]="CV"; Tablero.Tablero[0][7]="TV";
              Tablero.Tablero[1][0]="PV"; Tablero.Tablero[1][1]="PV"; Tablero.Tablero[1][2]="PV"; Tablero.Tablero[1][3]="PV"; Tablero.Tablero[1][4]="PV"; Tablero.Tablero[1][5]="PV"; Tablero.Tablero[1][6]="PV"; Tablero.Tablero[1][7]="PV"; 
              Tablero.Tablero[2][0]="--";Tablero. Tablero[2][1]="--"; Tablero.Tablero[2][2]="--"; Tablero.Tablero[2][3]="--"; Tablero.Tablero[2][4]="--";Tablero. Tablero[2][5]="--"; Tablero.Tablero[2][6]="--"; Tablero.Tablero[2][7]="--";
              Tablero.Tablero[3][0]="--"; Tablero.Tablero[3][1]="--"; Tablero.Tablero[3][2]="--"; Tablero.Tablero[3][3]="--"; Tablero.Tablero[3][4]="--"; Tablero.Tablero[3][5]="--"; Tablero.Tablero[3][6]="--"; Tablero.Tablero[3][7]="--";
              Tablero.Tablero[4][0]="--"; Tablero.Tablero[4][1]="--"; Tablero.Tablero[4][2]="--"; Tablero.Tablero[4][3]="--"; Tablero.Tablero[4][4]="--"; Tablero.Tablero[4][5]="--"; Tablero.Tablero[4][6]="--"; Tablero.Tablero[4][7]="--";
              Tablero.Tablero[5][0]="--"; Tablero.Tablero[5][1]="--"; Tablero.Tablero[5][2]="--"; Tablero.Tablero[5][3]="--"; Tablero.Tablero[5][4]="--"; Tablero.Tablero[5][5]="--"; Tablero.Tablero[5][6]="--"; Tablero.Tablero[5][7]="--";
              Tablero.Tablero[6][0]="PR"; Tablero.Tablero[6][1]="PR"; Tablero.Tablero[6][2]="PR"; Tablero.Tablero[6][3]="PR"; Tablero.Tablero[6][4]="PR"; Tablero.Tablero[6][5]="PR"; Tablero.Tablero[6][6]="PR"; Tablero.Tablero[6][7]="PR"; 
              Tablero.Tablero[7][0]="TR"; Tablero.Tablero[7][1]="CR"; Tablero.Tablero[7][2]="ER"; Tablero.Tablero[7][3]="VR"; Tablero.Tablero[7][4]="RR"; Tablero.Tablero[7][5]="ER"; Tablero.Tablero[7][6]="CR"; Tablero.Tablero[7][7]="TR";
             
                            Menu.validar=0;
                            Menu.Menu();
                      }
             
             Tablero.Tablero[fila2][columna2] = Tablero.Tablero[fila1][columna1];
             Tablero.Tablero[fila1][columna1] = "--";
             Tablero.contRojos +=1;
             Tablero.turno=false;
             Tablero.ImprimirTablero();
             
             
             }else{
               Tablero.Tablero[fila2][columna2] = Tablero.Tablero[fila1][columna1];
               Tablero.Tablero[fila1][columna1] = "--"; 
               Tablero.turno=false;
               Tablero.ImprimirTablero();
             
                 
                 
             }
                
            }else{
                System.out.println("");
                System.out.println("");
                System.out.print("Movimiento invalido !!!");
                Tablero.ImprimirTablero();
            }
        
        
    }else if(!Tablero.turno){
        
        if(((fila2 <8) && (columna2 <8)) && (Tablero.Tablero[fila2][columna2].equals("--") || Tablero.Tablero[fila2][columna2].charAt(1) != 'V') && (((fila2 == fila1 -2) && (columna2 == columna1 -2)) || ((fila2 == fila1-2) && (columna2 == columna1 +2)) || ((fila2 == fila1 +2) && (columna2 == columna1 -2)) || ((( fila2 == fila1 +2) && (columna2 == columna1 +2)) ))){
        
               if(Tablero.Tablero[fila2][columna2].charAt(1) != 'V' && (Tablero.Tablero[fila2][columna2].charAt(0) == 'P' || Tablero.Tablero[fila2][columna2].charAt(0) == 'T' || Tablero.Tablero[fila2][columna2].charAt(0) == 'C' || Tablero.Tablero[fila2][columna2].charAt(0) == 'E' || Tablero.Tablero[fila2][columna2].charAt(0) == 'V' || Tablero.Tablero[fila2][columna2].charAt(0) == 'R')){
             
             
             if(Tablero.Tablero[fila2][columna2].charAt(0)== 'P'){
                          System.out.println("El Elefante de "+Menu.j2+" se ha comido al Peon de  "+Menu.j1+" ");
                      }else if(Tablero.Tablero[fila2][columna2].charAt(0)=='T'){
                          System.out.println("El Elefante de "+Menu.j2+" se ha comido a la Torre de "+Menu.j1+" ");
                      }else if(Tablero.Tablero[fila2][columna2].charAt(0) == 'C'){
                          System.out.println("El Elefante de "+Menu.j2+" se ha comido al Caballo de "+Menu.j1+" ");
                      }else if(Tablero.Tablero[fila2][columna2].charAt(0) == 'E'){
                          System.out.println("El Elefante de "+Menu.j2+" se ha comido al Elefante de "+Menu.j1+" ");
                      }else if(Tablero.Tablero [fila2][columna2].charAt(0) == 'V'){
                          System.out.println("El Elefante de "+Menu.j2+" se ha comido al Visir de "+Menu.j1+" ");
                      }else if(Tablero.Tablero [fila2][columna2].charAt(0) == 'R'){
                          
                            System.out.println("");
                            System.out.println("");
                            System.out.println(" EL JUGADOR 2(VERDES): "+Menu.j2+ " HA ¡TRIUNFADO! SE COMIO AL REY Y " +Tablero.contVerdes+ " PIEZAS MAS DEL JUGADOR 1(ROJOS): "+ Menu.j1);
                            System.out.println("");
                            Menu.validar=0;
                            
                            Estadisticas.estadistica[9]=Estadisticas.estadistica[8];
                  Estadisticas.estadistica[8]=Estadisticas.estadistica[7];
                  Estadisticas.estadistica[7]=Estadisticas.estadistica[6];
                  Estadisticas.estadistica[6]=Estadisticas.estadistica[5];
                  Estadisticas.estadistica[5]=Estadisticas.estadistica[4];
                  Estadisticas.estadistica[4]=Estadisticas.estadistica[3];
                  Estadisticas.estadistica[3]=Estadisticas.estadistica[2];
                  Estadisticas.estadistica[2]=Estadisticas.estadistica[1];
                  Estadisticas.estadistica[1]=Estadisticas.estadistica[0];
                  Estadisticas.estadistica[0]=Menu.j2+ " ha ganado la partida porque le comio al Rey  y "+ Tablero.contVerdes+" piezas mas a "+Menu.j1+" ";
                            
                            
                            
                            Tablero.contRojos=0;
                            Tablero.contVerdes=0;
              Tablero.Tablero[0][0]="TV"; Tablero.Tablero[0][1]="CV"; Tablero.Tablero[0][2]="EV"; Tablero.Tablero[0][3]="RV"; Tablero.Tablero[0][4]="VV"; Tablero.Tablero[0][5]="EV"; Tablero.Tablero[0][6]="CV"; Tablero.Tablero[0][7]="TV";
              Tablero.Tablero[1][0]="PV"; Tablero.Tablero[1][1]="PV"; Tablero.Tablero[1][2]="PV"; Tablero.Tablero[1][3]="PV"; Tablero.Tablero[1][4]="PV"; Tablero.Tablero[1][5]="PV"; Tablero.Tablero[1][6]="PV"; Tablero.Tablero[1][7]="PV"; 
              Tablero.Tablero[2][0]="--";Tablero. Tablero[2][1]="--"; Tablero.Tablero[2][2]="--"; Tablero.Tablero[2][3]="--"; Tablero.Tablero[2][4]="--";Tablero. Tablero[2][5]="--"; Tablero.Tablero[2][6]="--"; Tablero.Tablero[2][7]="--";
              Tablero.Tablero[3][0]="--"; Tablero.Tablero[3][1]="--"; Tablero.Tablero[3][2]="--"; Tablero.Tablero[3][3]="--"; Tablero.Tablero[3][4]="--"; Tablero.Tablero[3][5]="--"; Tablero.Tablero[3][6]="--"; Tablero.Tablero[3][7]="--";
              Tablero.Tablero[4][0]="--"; Tablero.Tablero[4][1]="--"; Tablero.Tablero[4][2]="--"; Tablero.Tablero[4][3]="--"; Tablero.Tablero[4][4]="--"; Tablero.Tablero[4][5]="--"; Tablero.Tablero[4][6]="--"; Tablero.Tablero[4][7]="--";
              Tablero.Tablero[5][0]="--"; Tablero.Tablero[5][1]="--"; Tablero.Tablero[5][2]="--"; Tablero.Tablero[5][3]="--"; Tablero.Tablero[5][4]="--"; Tablero.Tablero[5][5]="--"; Tablero.Tablero[5][6]="--"; Tablero.Tablero[5][7]="--";
              Tablero.Tablero[6][0]="PR"; Tablero.Tablero[6][1]="PR"; Tablero.Tablero[6][2]="PR"; Tablero.Tablero[6][3]="PR"; Tablero.Tablero[6][4]="PR"; Tablero.Tablero[6][5]="PR"; Tablero.Tablero[6][6]="PR"; Tablero.Tablero[6][7]="PR"; 
              Tablero.Tablero[7][0]="TR"; Tablero.Tablero[7][1]="CR"; Tablero.Tablero[7][2]="ER"; Tablero.Tablero[7][3]="VR"; Tablero.Tablero[7][4]="RR"; Tablero.Tablero[7][5]="ER"; Tablero.Tablero[7][6]="CR"; Tablero.Tablero[7][7]="TR";
             
                            Menu.Menu();
                      }
             
             Tablero.Tablero[fila2][columna2] = Tablero.Tablero[fila1][columna1];
             Tablero.Tablero[fila1][columna1] = "--";
             Tablero.contVerdes +=1;
             Tablero.turno=true;
             Tablero.ImprimirTablero();
            
             
             }else{
               Tablero.Tablero[fila2][columna2] = Tablero.Tablero[fila1][columna1];
               Tablero.Tablero[fila1][columna1] = "--"; 
               Tablero.turno=true;
               Tablero.ImprimirTablero();
               
                 
                 
             }
                
            }else{
                
                System.out.println("");
                System.out.println("");
                System.out.print("Movimiento invalido !!!");
                Tablero.ImprimirTablero();
            }
        
        
        
          }
                
        
        
    }
    
}
