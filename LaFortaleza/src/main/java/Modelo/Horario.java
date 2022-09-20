package Modelo;

public class Horario {

    private String hora_ini;
    private String hora_fin;
    private String salon;

    public Horario() {
    }

    public Horario(String hora_ini, String hora_fin, String salon) {
        this.hora_ini = hora_ini;
        this.hora_fin = hora_fin;
        this.salon = salon;
    }

    public String getHora_ini() {
        return hora_ini;
    }

    public void setHora_ini(String hora_ini) {
        this.hora_ini = hora_ini;
    }

    public String getHora_fin() {
        return hora_fin;
    }

    public void setHora_fin(String hora_fin) {
        this.hora_fin = hora_fin;
    }

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

}
