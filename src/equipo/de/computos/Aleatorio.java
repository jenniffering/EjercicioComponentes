
package equipo.de.computos;

/**
 *
 * @author Jenniffer Alvarez
 */
      
/*Metodo para generar los numeros Pseudo-Aliatorios los cuales cumplen 
    con una distribucion Uniforme en [0,1]*/
public class Aleatorio {
   private double a=1103515245;
   private double c=12345;
   private double m = Math.pow(2,32);
   private double semilla = 5;
   
   public Aleatorio(double sem){
       this.semilla= semilla;
   }
   
   public double siguiente(){
       semilla=(a*semilla+c)%m;
       double x = semilla/m;
       return x;
   } 

    public double getSemilla() {
        return semilla;
    }

    public void setSemilla(double semilla) {
        this.semilla = semilla;
    }
   
   
   
}

