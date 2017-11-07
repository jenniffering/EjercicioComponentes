
package equipo.de.computos.Logica;

import java.util.ArrayList;



/**
 *
 * @author Jenniffer Alvarez
 */
public class Equipo {
   int comp1,comp2,comp3,comp4;
     TiempoU t= new TiempoU();
     ArrayList costop1= new ArrayList();
     ArrayList costop2= new ArrayList();
    ArrayList suspencionp2 = new ArrayList();
    ArrayList suspencionp1 = new ArrayList(); 
   
     

public Equipo(){
 t.variablesaleatorias();              
}

public void politica1(){
      int suspenciones1=0;
    comp1=t.retornarVida_u();
    comp2=t.retornarVida_u();
    comp3=t.retornarVida_u();
    comp4=t.retornarVida_u();
    int penalizacion=0;
    int costoxc=0;
    int costo=0;
    

    for(int i=0;i<20000;i++){
      if(comp1!=0 && comp2!=0 &&comp3!=0 && comp4!=0){
      comp1--;
      comp2--;
      comp3--;
      comp4--;
        }
      if(comp1==0){
      comp1=t.retornarVida_u();
      costoxc+=200;
      penalizacion+=100;
      i++;
      suspenciones1++;
      }
      if(comp2==0){
      comp2=t.retornarVida_u();
      costoxc+=200;
      penalizacion+=100;
      i++;
      suspenciones1++;
      }
      if(comp3==0){
      comp3=t.retornarVida_u();
      costoxc+=200;
      penalizacion+=100;
      i++;
      suspenciones1++;
      }
      if(comp4==0){
      comp4=t.retornarVida_u();
      costoxc+=200;
      penalizacion+=100;
      i++;
      suspenciones1++;
      }

    }
    costo=costoxc+penalizacion;
    costop1.add(costo);
    suspencionp1.add(suspenciones1);
      
}
public void politica2(){
    
    int suspenciones2=0;
    comp1=t.retornarVida_u();
    comp2=t.retornarVida_u();
    comp3=t.retornarVida_u();
    comp4=t.retornarVida_u();
    int penalizacion=0;
    int costoxc=0;
    int costo=0;
    
for(int i=0;i<20000;i++){
      if(comp1!=0 && comp2!=0 &&comp3!=0 && comp4!=0){
      comp1--;
      comp2--;
      comp3--;
      comp4--;
        }
      if(comp1==0){
      comp1=t.retornarVida_u();
      comp2=t.retornarVida_u();
      comp3=t.retornarVida_u();
      comp4=t.retornarVida_u();
      costoxc+=800;
      penalizacion+=200;
      i+=2;
      suspenciones2++;
      }
      if(comp2==0){
      comp1=t.retornarVida_u();
      comp2=t.retornarVida_u();
      comp3=t.retornarVida_u();
      comp4=t.retornarVida_u();
      costoxc+=800;
      penalizacion+=200;
      i+=2;
      suspenciones2++;
      }
      if(comp3==0){
      comp1=t.retornarVida_u();
      comp2=t.retornarVida_u();
      comp3=t.retornarVida_u();
      comp4=t.retornarVida_u();
      costoxc+=800;
      penalizacion+=200;
      i+=2;
      suspenciones2++;
      }
      if(comp4==0){
      comp1=t.retornarVida_u();
      comp2=t.retornarVida_u();
      comp3=t.retornarVida_u();
      comp4=t.retornarVida_u();
      costoxc+=800;
      penalizacion+=200;
       i+=2;
       suspenciones2++;
      }

    }
    costo=costoxc+penalizacion;
    costop2.add(costo);
    suspencionp2.add(suspenciones2);


}
public void promediocostos(){
    int n = 0,m=0,s1=0,s2=0;
 for(int i=0;i<costop1.size();i++){
     n+=(int) costop1.get(i);
     
 }
 n=n/costop1.size();
  for(int i=0;i<costop2.size();i++){
     m+=(int) costop2.get(i);
 }
 m=m/costop2.size();
 
 if(n<m){
     System.out.println("La politica 1 tiene un costo menor promedio por ende es la mejor opción a implementar " + "\n"
             +"Politica 1: "+n + "\n"+ "Politica 2: "+m);
 
 
 }else{
      System.out.println("La politica 2 tiene un costo menor promedio por ende es la mejor opción a implementar " + "\n"
             +"Politica 2: "+m + "\n"+ "Politica 1: "+n);
 }
        
 
}

  
    
  
}



