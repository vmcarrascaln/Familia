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
public class Miembro {
   private String nombre;
   private String apelido;
   private int edad;
   private int sexo;
   private String rol;

    public Miembro(String nombre, String apelido, int edad, int sexo, String rol) {
        this.nombre = nombre;
        this.apelido = apelido;
        this.edad = edad;
        this.sexo = sexo;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Miembro{" + "nombre=" + nombre + ", apelido=" + apelido + ", edad=" + edad + ", sexo=" + sexo + ", rol=" + rol + '}';
    }
   
   
}
