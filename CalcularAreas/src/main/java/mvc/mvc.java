package mvc;

import Modelo.*;
import Control.*;
import Vista.*;

public class mvc {

    public static void main(String[] args) {

        Vista vistaV = new Vista();

        Circulo circuloM = new Circulo();
        Rectangulo rectanguloM = new Rectangulo();
        Triangulo trianguloM = new Triangulo();
        Control controller = new Control(circuloM, rectanguloM, trianguloM, vistaV);

        vistaV.setVisible(true);
        vistaV.setTitle("Calcular Areas");

    }

}
