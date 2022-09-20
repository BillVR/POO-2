package Modelo;

public class Grupo {

    private String id;
    private Integer capacIntegercidad;

    public Grupo() {
    }

    public Grupo(String id, Integer capacIntegercidad) {
        this.id = id;
        this.capacIntegercidad = capacIntegercidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCapacIntegercidad() {
        return capacIntegercidad;
    }

    public void setCapacIntegercidad(Integer capacIntegercidad) {
        this.capacIntegercidad = capacIntegercidad;
    }

}
