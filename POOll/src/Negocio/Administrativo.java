/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Estudiante
 */
public class Administrativo {
    
    int anio_ingreso;
    
    public int CalcularAnios(int anio_ingreso){
        
        int anio_actual = 2022;
        
        int antiguedad = anio_actual - anio_ingreso;
        
        return antiguedad;
    }

    public int getAnio_ingreso() {
        return anio_ingreso;
    }

    public void setAnio_ingreso(int anio_ingreso) {
        this.anio_ingreso = anio_ingreso;
    }
    
    
    
}
