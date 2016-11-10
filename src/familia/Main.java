/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familia;

/**
 *
 * @author Estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Miembro m1 =
               new Miembro("Victor", "Carrascal", 20, 1,"hijo");
       Miembro m2=
               new Miembro("V", "C", 44, 1, "Padre");
       Familia f1 = new Familia ("Carrascal");
       f1.ingresarMiembro(m1);
       f1.ingresarMiembro(m2);
       
       RegistroFamilia r= new RegistroFamilia();
        for ( int i = 0; i<20;i++)
            r.ingresarFamilia(f1);
        //r.listarFamilias();
        r.consultarFamilia("Carrascal");
            
        }
    }
  
