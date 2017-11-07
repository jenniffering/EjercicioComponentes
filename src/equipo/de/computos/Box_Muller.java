
package equipo.de.computos;

import java.util.ArrayList;

/**
 *
 * @author Jenniffer Alvarez
 */
public class Box_Muller {
     
    /* Definimos los dos numeros aleatorios y los dos variables aleatorias, de igual forma la media y la desviación*/
    double x_1;
    double x_2;
    double z_1;
    double z_2;
    float media;
    float desviacion;

    /* Definios el constructor en el cual se tiene en cuenta la media y la desviación*/
 public Box_Muller (double x_1, double x_2,float media, float desviacion){
       this.x_1=x_1;
       this.x_2=x_1;
       this.media=media;
       this.desviacion=desviacion;
   }
    //Metodo para generar la viariable X
    public int  variablex(){
        
       z_1= this.media+ this.desviacion*(this.z_1= Math.sqrt(-2*Math.log(this.x_1))*Math.cos(2*Math.PI*this.x_2));
       return (int) z_1; 
      }
    //Metodo para generar la viariable Y
  public int  variabley(){
        
       z_2= this.media+ this.desviacion*(this.z_1= Math.sqrt(-2*Math.log(this.x_1))*Math.sin(2*Math.PI*this.x_2));
       return (int) z_2;
       
      }

  
   
    
}
