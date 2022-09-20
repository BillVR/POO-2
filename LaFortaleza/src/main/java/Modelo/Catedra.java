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
public class Catedra extends Profesor {
    
    private int contrato_sem, num_horas_sem, valor_hora;
    private String categoria;
    
    public void calcularValorHora(String categoria){
        switch (categoria) {
            case "Auxiliar": 
                valor_hora = 20000;
                break;
            case "Asistente": 
                valor_hora = 30000;
                break;
            case "Asociado": 
                valor_hora = 40000;
                break;
        } 
    } 
    
    private int calcularSalario(int num_horas_sem, int valor_hora){
        int salario;
        salario = valor_hora * num_horas_sem;
        return salario;
    }

    public int getContrato_sem() {
        return contrato_sem;
    }

    public void setContrato_sem(int contrato_sem) {
        this.contrato_sem = contrato_sem;
    }

    public int getNum_horas_sem() {
        return num_horas_sem;
    }

    public void setNum_horas_sem(int num_horas_sem) {
        this.num_horas_sem = num_horas_sem;
    }

    public int getValor_hora() {
        return valor_hora;
    }

    public void setValor_hora(int valor_hora) {
        this.valor_hora = valor_hora;
    }   
}
