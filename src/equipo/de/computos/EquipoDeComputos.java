
package equipo.de.computos;

import equipo.de.computos.Logica.Equipo;
import equipo.de.computos.Logica.TiempoU;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Jenniffer Alvarez
 */
public class EquipoDeComputos {


    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       int n;
    System.out.print("Introduzca el numero de corridas a realizar: ");
    n = sc.nextInt();
       Equipo sbd=new Equipo();
       
       for(int i=0;i<n;i++){
        sbd.politica1();
        sbd.politica2();
     
       }
   sbd.promediocostos();

     
    }
    
 
    
}
