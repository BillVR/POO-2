package Control;

import Modelo.*;
import Vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Control implements ActionListener {

    private Circulo circulo;
    private Rectangulo rectangulo;
    private Triangulo triangulo;
    private Vista vista;

    public Control() {
    }

    public Control(Circulo c, Rectangulo r, Triangulo t, Vista v) {
        super();
        this.circulo = c;
        this.rectangulo = r;
        this.triangulo = t;
        this.vista = v;
        actionListener(this);
    }

    public void actionListener(ActionListener control) {

        System.out.println("Peurr");
        vista.btnGuardar.addActionListener(control);
        vista.btnCalcular.addActionListener(control);
        vista.btnMostrar.addActionListener(control);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println("action");
        if (e.getActionCommand().equals("Guardar")) {
            System.out.println("hhhhhh");
            Double base = Double.parseDouble(vista.txtBase.getText());
            Double altura = Double.parseDouble(vista.txtAltura.getText());

            triangulo.setBase(base);
            triangulo.setAltura(altura);

        } else if (e.getActionCommand().contentEquals("Calcular")) {
            triangulo.area();
            FiguraGeometrica fg = new Triangulo();
            fg.area();
        } else if (e.getActionCommand().contentEquals("Mostrar")) {
            vista.txtAreaTriangulo.setText(String.valueOf(triangulo.area()));
        }

    }
    
}
