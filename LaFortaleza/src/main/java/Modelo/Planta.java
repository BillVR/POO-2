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
public class Planta extends Profesor{
    
    private int salario_base, puntos_salario, valor_punto, num_resolucion;
    private String categoria, fecha;

    public int getSalario_base() {
        return salario_base;
    }

    public void setSalario_base(int salario_base) {
        this.salario_base = salario_base;
    }

    public int getPuntos_salario() {
        return puntos_salario;
    }

    public void setPuntos_salario(int puntos_salario) {
        this.puntos_salario = puntos_salario;
    }

    public int getValor_punto() {
        return valor_punto;
    }

    public void setValor_punto(int valor_punto) {
        this.valor_punto = valor_punto;
    }

    public int getNum_resolucion() {
        return num_resolucion;
    }

    public void setNum_resolucion(int num_resolucion) {
        this.num_resolucion = num_resolucion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    private int calcularSalario(){
        int salario = 0;
        salario = salario_base + puntos_salario;
        return salario;
    }
    
}
