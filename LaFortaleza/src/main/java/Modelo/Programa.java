package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Programa {
    
    List<Asignatura> asignaturaList = null;

    private String codigo;
    private String nombre;
    private Profesor director;

    public Programa() {
        asignaturaList = new ArrayList<Asignatura>();
        cargarAsignaturas();
        
    }

    public Programa(String codigo, String nombre, Profesor director) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.director = director;
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

    public Profesor getDirector() {
        return director;
    }

    public void setDirector(Profesor director) {
        this.director = director;
    }
    
    public void cargarAsignaturas(){
        Asignatura a1=new Asignatura("1", "Ingles", 3);
        asignaturaList.add(a1);
        Asignatura a2=new Asignatura("2", "Español", 3);
        asignaturaList.add(a2);
        Asignatura a3=new Asignatura("3", "Quimica", 3);
        asignaturaList.add(a3);
    }

}
