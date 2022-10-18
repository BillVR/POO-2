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
    
    private int num_id, edad, identificacion;
    private String nombre;

    public Usuario(int num_id, int edad, String nombre, int identificacion) {
        this.num_id = num_id;
        this.edad = edad;
        this.nombre = nombre;
        this.identificacion = identificacion;
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

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public String toString() {
        return "Usuario{" + "num_id=" + num_id + ", edad=" + edad + ", nombre=" + nombre + '}';
    }

}

