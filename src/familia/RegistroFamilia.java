/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familia;
import java.util.*;

/**
 *
 * @author Estudiante
 */
public class RegistroFamilia {
    private ArrayList<Familia> familias;
    
    public RegistroFamilia (){
        this.familias = new ArrayList<Familia>();
        
    }
  public boolean ingresarFamilia(Familia familia){
      boolean insercion = this.familias.add(familia);
      return insercion;
  }
  public void listarFamilias(){
      for (Familia familia : familias) {
          System.out.println("----------");
          familia.listarMiembros();
          System.out.println("------------");
              
      }    
}
  public void consultarFamilia (String apellido){
      for(Familia familia : familias){
         if(familia.getApellido().equals(apellido)){
             familia.listarMiembros();
         }
      }
  }
  }

