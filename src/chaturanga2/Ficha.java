/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chaturanga2;

/**
 *
 * @author Josue
 */
public abstract class Ficha {
   
    protected int filaI;
    protected int columI;
    protected int filaF;
    protected int columF;
    protected static int Lista_fila=0;
    protected static int Lista_columna=0;
    public String resultado;
   
    
   
    public Ficha(int p1, int p2){
        Lista_fila=p1;
        Lista_columna=p2;
        
    }
    
  
    
    
    
    
     
     
          

  
    public abstract void Mover(int fila1, int columna1, int fila2, int columna2);
        
       
    
    
    
}
