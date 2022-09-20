package Modelo;

import java.util.List;
import java.util.ArrayList;

public class Departamento {

    List<Profesor> profesorList = null;
    List<Programa> programaList = null;

    private String codigo;
    private String nombre;
    private String ubicacion;

    public Departamento() {
    }

    public Departamento(String codigo, String nombre, String ubicacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    public void cargarPrograma(){
        Programa p1= new Programa();
        
        
    }
}
