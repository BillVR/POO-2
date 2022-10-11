/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author estudiante
 */
public class Usuario {
    
    private int num_id, edad;
    private String nombre;

    public Usuario(int num_id, int edad, String nombre) {
        this.num_id = num_id;
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getNum_id() {
        return num_id;
    }

    public void setNum_id(int num_id) {
        this.num_id = num_id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Usuario{" + "num_id=" + num_id + ", edad=" + edad + ", nombre=" + nombre + '}';
    }

}

