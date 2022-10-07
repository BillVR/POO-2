package modelo;

public class Feligres {

    private String cedula;
    private int estrato;
    private String nombre;
    private String direccion;
    private String telefono;
    private boolean estado;

    public Feligres() {
    }

    public Feligres(String cedula, int estrato, String nombre, String direccion, String telefono, boolean estado) {
        this.cedula = cedula;
        this.estrato = estrato;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.estado = estado;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    //metodo para calcular el valor del diezmo
    public int calcularValorDiezmo() {
        int valorDiezmo = 0;
        if (estrato == 1) {
            valorDiezmo = 250000;
        } else if (estrato == 2 || (estrato == 3)) {
            valorDiezmo = 500000;
        } else if (estrato > 3) {
            valorDiezmo = 1000000;
        }

        return valorDiezmo;
    }

    //metodo para saber si el feligres es un deudor o a cumplido con el diezmo
    public String mostrarEstado() {
        String e="";
        if (estado == true) {
            e="Pagado";
        } else {
            e="Sin pagar";
        }
        return e;
    }
    
    //metodo to String    
    @Override
    public String toString(){
        return "Nombre: "+getNombre()+", Cedula: "+getCedula()+", Direccion: "+getDireccion()+", Telefono: "+getTelefono()+", Estrato: "+getEstrato()+", Estado: "+mostrarEstado();
    }

}
