package Modelo;

public abstract class FiguraGeometrica {

    public abstract Double area();

    @Override
    public String toString() {
        return "Area = " + area();
    }

}
