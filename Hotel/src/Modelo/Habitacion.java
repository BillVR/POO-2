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
public class Habitacion {
    
    private String tipo;
    private int num_hab, fecha;

    public Habitacion(String tipo, int num_hab, int fecha) {
        this.tipo = tipo;
        this.num_hab = num_hab;
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNum_hab() {
        return num_hab;
    }

    public void setNum_hab(int num_hab) {
        this.num_hab = num_hab;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "tipo=" + tipo + ", num_hab=" + num_hab + ", fecha=" + fecha + '}';
    }
    
}
