package Modelo;

public class Circulo extends FiguraGeometrica {

    private Integer radio;

    public Circulo() {
    }

    public Circulo(Integer radio) {
        this.radio = radio;
    }

    public Integer getRadio() {
        return radio;
    }

    public void setRadio(Integer radio) {
        this.radio = radio;
    }

    @Override
    public Double area() {
        return Math.PI * Math.pow(radio, 2);
    }

}
