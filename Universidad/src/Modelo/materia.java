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
public class materia {
    
    private String codigo, codProfesor, creditos, nombre;

    public materia(String codigo, String codProfesor, String creditos, String nombre) {
        this.codigo = codigo;
        this.codProfesor = codProfesor;
        this.creditos = creditos;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodProfesor() {
        return codProfesor;
    }

    public void setCodProfesor(String codProfesor) {
        this.codProfesor = codProfesor;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "materia{" + "codigo=" + codigo + ", codProfesor=" + codProfesor + ", creditos=" + creditos + ", nombre=" + nombre + '}';
    }
}
