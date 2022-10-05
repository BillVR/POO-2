package Modelo;

public class Triangulo extends FiguraGeometrica{
    
    private Double base;
    private Double altura;

    public Triangulo() {
    }

    public Triangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
    
    public Double area(){
        return base/altura/2;
    }
    
    @Override
    public String toString(){
        return "Triangulo(+Base ="+base+", altura: "+altura+")";
    }

}
