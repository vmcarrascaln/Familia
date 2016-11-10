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
public class Familia {
    private String apellido;
    private ArrayList<Miembro> miembros;

    public Familia(String apellido) {
        this.apellido = apellido;
        this.miembros = new ArrayList<Miembro> ();
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public boolean ingresarMiembro(Miembro miembro){
        boolean insercion = this.miembros.add(miembro);
        return insercion;
        
    }
    public void listarMiembros (){
        for (Miembro m : this.miembros){
            System.out.println(m);
        }
     
    }
    }

