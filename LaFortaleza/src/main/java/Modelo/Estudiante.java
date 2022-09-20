package Modelo;

import java.util.List;

public class Estudiante {

    private String codigo;
    private String nombre;
    private String direccion;
    private String genero;
    private String correo;
    
    List<Asignatura> asignaturaList = null;

    public Estudiante() {
    }
    
    public Estudiante(String codigo, String nombre, String direccion, String genero, String correo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.genero = genero;
        this.correo = correo;
    }
    
    public List<Asignatura> getAsignaturaList() {
        return asignaturaList;
    }

    public void setAsignaturaList(List<Asignatura> asignaturaList) {
        this.asignaturaList = asignaturaList;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Estudiante: " + getNombre() + "\tDireccion: " + getDireccion()+ "\tCodigo: "
 + getCodigo() + "\tCorreo: " + getCorreo()+"\tGenero: "+getGenero();
    }

}
