
package equipo.de.computos.Logica;

import equipo.de.computos.Aleatorio;
import equipo.de.computos.Box_Muller;
import java.util.ArrayList;

/**
 *
 * @author Jenniffer Alvarez
 */

public class TiempoU {
      Aleatorio n = new Aleatorio(5);
      //Creo un arraylist el cual guardara las variables aleatorias
      ArrayList variablesA = new ArrayList();
      int bandera=0; 
      

  //Metodo encargado de almacenar el numero de variables aleatorias hasta el limite del for
    public void variablesaleatorias(){
        
    for(int i=0;i<400000;i++){
           double n1=n.siguiente();
           double n2=n.siguiente();
       Box_Muller v= new Box_Muller(n1,n2,600,100);
       variablesA.add(v.variablex());
       variablesA.add(v.variabley());
      
       }
    
     
     }
    
    // Metodo el cual retornara el 1 numero del arraylist en orden (por la bandera).
    public int  retornarVida_u(){
    int n =(int) variablesA.get(bandera);
    bandera++;
    return n;
     
    }


}

