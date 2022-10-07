package controlador;

import modelo.*;
import vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Control implements ActionListener {

    private Feligres modelo;
    private Vista vista;
    List<Feligres> feligresList = null;
    Integer gananciasTotales = 0;

    public Control() {
    }

    public Control(Feligres m, Vista v) {
        this.modelo = m;
        this.vista = v;
        feligresList = new ArrayList<Feligres>();
        actionListener(this);
    }

    public void actionListener(ActionListener control) {
        vista.btnGuardar.addActionListener(control);
        vista.btnEliminar.addActionListener(control);
        vista.btnActualizar.addActionListener(control);
        vista.btnBuscar.addActionListener(control);

        vista.btnConsultarDiezmo.addActionListener(control);
        vista.btnTotalizarDiezmo.addActionListener(control);
        vista.btnPagarDiezmo.addActionListener(control);

        vista.btnMostrar.addActionListener(control);
        vista.btnLimpiar.addActionListener(control);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Guardar")) {
            boolean aux = false;
            for (int i = 0; i < feligresList.size(); i++) {
                if (feligresList.get(i).getCedula().equals(vista.txtCedula.getText())) {
                    aux = true;
                    if (aux == true) {
                        vista.txtAreaResultado.setText("Usuario Ya existente");
                    }
                }
            }
            if (aux == false) {
                Feligres f1 = new Feligres();
                f1.setCedula(vista.txtCedula.getText());
                f1.setNombre(vista.txtNombre.getText());
                f1.setDireccion(vista.txtDireccion.getText());
                f1.setTelefono(vista.txtTelefono.getText());
                f1.setEstrato(Integer.parseInt((String) vista.jComboBoxEstrato.getSelectedItem()));
                feligresList.add(f1);
            }

        } else if (e.getActionCommand().contentEquals("Eliminar")) {
            boolean aux = false;
            for (int i = 0; i < feligresList.size(); i++) {
                if (feligresList.get(i).getCedula().equals(vista.txtCedula.getText())) {
                    aux = true;
                    if (aux = true) {
                        feligresList.remove(feligresList.get(i));
                    }
                }
            }

        } else if (e.getActionCommand().contentEquals("Actualizar")) {
            boolean aux = false;
            for (int i = 0; i < feligresList.size(); i++) {
                if (feligresList.get(i).getCedula().equals(vista.txtCedula.getText())) {
                    aux = true;
                    if (aux == true) {
                        feligresList.get(i).setNombre(vista.txtNombre.getText());
                        feligresList.get(i).setDireccion(vista.txtDireccion.getText());
                        feligresList.get(i).setTelefono(vista.txtTelefono.getText());
                        feligresList.get(i).setEstrato(Integer.parseInt((String) vista.jComboBoxEstrato.getSelectedItem()));
                    }
                }
            }
            if (aux == false) {
                vista.txtAreaResultado.setText("Usuario No existe");
            }

        } else if (e.getActionCommand().contentEquals("Buscar")) {
            boolean aux = false;
            for (int i = 0; i < feligresList.size(); i++) {
                if (feligresList.get(i).getCedula().equals(vista.txtCedula.getText())) {
                    aux = true;
                    if (aux == true) {
                        vista.txtAreaResultado.setText("Usuario Encontrado: \n" + feligresList.get(i).toString());
                        vista.txtNombre.setText(feligresList.get(i).getNombre());
                        vista.txtDireccion.setText(feligresList.get(i).getDireccion());
                        vista.txtTelefono.setText(feligresList.get(i).getTelefono());
                        
                        if (feligresList.get(i).getEstrato() == 1) {
                            vista.jComboBoxEstrato.setSelectedIndex(0);
                        }
                        if (feligresList.get(i).getEstrato() == 2) {
                            vista.jComboBoxEstrato.setSelectedIndex(1);
                        }
                        if (feligresList.get(i).getEstrato() == 3) {
                            vista.jComboBoxEstrato.setSelectedIndex(2);
                        }
                        if (feligresList.get(i).getEstrato() == 4) {
                            vista.jComboBoxEstrato.setSelectedIndex(3);
                        }
                        if (feligresList.get(i).getEstrato() == 5) {
                            vista.jComboBoxEstrato.setSelectedIndex(4);
                        }
                        if (feligresList.get(i).getEstrato() == 6) {
                            vista.jComboBoxEstrato.setSelectedIndex(5);
                        }
                        
                        if (feligresList.get(i).isEstado()== false) {
                            vista.jComboBoxEstado.setSelectedIndex(0);
                        }
                        if (feligresList.get(i).isEstado()== true) {
                            vista.jComboBoxEstado.setSelectedIndex(1);
                        }

                    }
                }
                if (aux == false) {
                    vista.txtAreaResultado.setText("Usuario No Encontrado");
                }
            }

        } else if (e.getActionCommand().contentEquals("Consultar")) {

            boolean aux = false;
            for (int i = 0; i < feligresList.size(); i++) {
                if (feligresList.get(i).getCedula().equals(vista.txtCedulaDiezmo.getText())) {
                    aux = true;
                    if (aux == true) {
                        vista.txtValorDiezmo.setText(String.valueOf(feligresList.get(i).calcularValorDiezmo()));
                    }
                }
            }
            if (aux == false) {
                vista.txtValorDiezmo.setText("NOT DATA");
            }

        } else if (e.getActionCommand().contentEquals("Totalizar")) {

            vista.txtAreaResultado.setText("Lo Recaudado por la Iglesia es: " + gananciasTotales);

        } else if (e.getActionCommand().contentEquals("Pagar")) {

            boolean aux = false;
            for (int i = 0; i < feligresList.size(); i++) {
                if (feligresList.get(i).isEstado() == true) {
                    vista.txtAreaResultado.setText("Este Usuario ya a pagado");
                } else if (feligresList.get(i).getCedula().equals(vista.txtCedulaDiezmo.getText())) {
                    aux = true;
                    if (aux == true) {
                        feligresList.get(i).setEstado(true);
                        vista.txtAreaResultado.setText("Pago Realizado Correctamente");
                        gananciasTotales = gananciasTotales + feligresList.get(i).calcularValorDiezmo();
                    }
                }
            }
            if (aux == false) {
                vista.txtValorDiezmo.setText("0");
            }

        } else if (e.getActionCommand().contentEquals("Mostrar")) {

            vista.txtAreaResultado.setText("");
            for (int i = 0; i < feligresList.size(); i++) {
                vista.txtAreaResultado.setText(vista.txtAreaResultado.getText() + "\n" + feligresList.get(i).toString());
            }

        } else if (e.getActionCommand().contentEquals("Limpiar")) {
            vista.txtAreaResultado.setText("");
        }

    }

}
