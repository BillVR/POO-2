package Vista;

import Modelo.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Formulario extends javax.swing.JFrame {

    List<Estudiante> estudianteList = null;
    List<Asignatura> asignaturaList = null;
    List<Departamento> departamentoList = null;
    List<Profesor> profesorList = null;
    List<Programa> programaList = null;

    public Formulario() {
        initComponents();
        estudianteList = new ArrayList<Estudiante>();
        asignaturaList = new ArrayList<Asignatura>();
        departamentoList = new ArrayList<Departamento>();
        profesorList = new ArrayList<Profesor>();
        programaList = new ArrayList<Programa>();
        cargarDepartamentos();
        cargarProfesores();
        cargarProgramas();
        cargarAsignaturas();

    }

    public void cargarCombo() {

    }

    public void cargarDepartamentos() {
        Departamento d1 = new Departamento("100", "Ciencias Basicas", "Fundadores");
        departamentoList.add(d1);
        Departamento d2 = new Departamento("101", "Ingenieria", "Aula sur");
        departamentoList.add(d2);
        Departamento d3 = new Departamento("102", "Ciencias ambielntales", "Aula General");
        departamentoList.add(d3);
    }

    public void cargarProgramas() {

        Programa p1 = new Programa("10", "Ingenieria De Sistemas", profesorList.get(0));
        Programa p2 = new Programa("10", "Licenciatura En Matematicas", profesorList.get(2));
        Programa p3 = new Programa("10", "Ingenieria Ambiental", profesorList.get(4));

        programaList.add(p1);
        programaList.add(p2);
        programaList.add(p3);

        ComboPrograma.addItem(p1.getNombre());
        ComboPrograma.addItem(p2.getNombre());
        ComboPrograma.addItem(p3.getNombre());

    }

    public void cargarProfesores() {
        Profesor p1 = new Profesor("998080", "Julian Alvarez", "Ingeniero Mecanico", departamentoList.get(0));
        Profesor p2 = new Profesor("998081", "Fabian Ruiz", "Ingeniero de Sistemas", departamentoList.get(0));
        Profesor p3 = new Profesor("998082", "Julieth Ramirez", "Doctorado En Mecatronica", departamentoList.get(1));
        Profesor p4 = new Profesor("998083", "Sofia Torres", "Ingeniera Mecanico", departamentoList.get(1));
        Profesor p5 = new Profesor("998084", "Gerardo Lizcano", "Ingeniero Quimico", departamentoList.get(2));
        Profesor p6 = new Profesor("998085", "Kevin Aguirre", "Ingeniero Ambiental", departamentoList.get(2));

        profesorList.add(p1);
        profesorList.add(p2);
        profesorList.add(p3);
        profesorList.add(p4);
        profesorList.add(p5);
        profesorList.add(p6);
    }

    public void cargarAsignaturas() {

        Asignatura a1 = new Asignatura("1107001", "Matematicas 1", 4);
        Asignatura a2 = new Asignatura("1107011", "Matematicas 2", 4);
        Asignatura a3 = new Asignatura("1107002", "Fisica 1", 3);
        Asignatura a4 = new Asignatura("1107012", "Fisica 2", 3);
        Asignatura a5 = new Asignatura("1101001", "Fundamentos De Programacion", 2);
        Asignatura a6 = new Asignatura("1102001", "Topografia", 2);
        Asignatura a7 = new Asignatura("1103001", "Matematica Evolutiva", 2);

        asignaturaList.add(a1);
        asignaturaList.add(a2);
        asignaturaList.add(a3);
        asignaturaList.add(a4);
        asignaturaList.add(a5);
        asignaturaList.add(a6);
        asignaturaList.add(a7);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonRegistrarDepartamento = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        codigoTxt = new javax.swing.JTextField();
        direccionTxt = new javax.swing.JTextField();
        nombreTxt = new javax.swing.JTextField();
        generoTxt = new javax.swing.JTextField();
        correoTxt = new javax.swing.JTextField();
        buttonGuardar = new javax.swing.JButton();
        buttonAsignaturas = new javax.swing.JButton();
        lblPrograma = new javax.swing.JLabel();
        ComboPrograma = new javax.swing.JComboBox<>();
        buttonMatricularAsignatura = new javax.swing.JButton();
        buttonHorarios = new javax.swing.JButton();
        lblVer = new javax.swing.JLabel();
        buttonBuscar = new javax.swing.JButton();
        lblRegistroEstudiante = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        buttonRegistrarDepartamento.setText("Registrar Departamento");
        buttonRegistrarDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarDepartamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(buttonRegistrarDepartamento)
                .addContainerGap(321, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(buttonRegistrarDepartamento)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        lblCodigo.setText("Codigo:");

        lblNombre.setText("Nombre:");

        lblGenero.setText("Genero:");

        lblDireccion.setText("Direccion:");

        lblCorreo.setText("Correo:");

        buttonGuardar.setText("Guardar");
        buttonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGuardarActionPerformed(evt);
            }
        });

        buttonAsignaturas.setText("Asignaturas");
        buttonAsignaturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAsignaturasActionPerformed(evt);
            }
        });

        lblPrograma.setText("Programa:");

        ComboPrograma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        buttonMatricularAsignatura.setText("Matricular Asignatura");
        buttonMatricularAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMatricularAsignaturaActionPerformed(evt);
            }
        });

        buttonHorarios.setText("Horarios");

        lblVer.setText("Ver:");

        buttonBuscar.setText("Buscar");
        buttonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(codigoTxt)
                            .addComponent(generoTxt)
                            .addComponent(nombreTxt)
                            .addComponent(direccionTxt)
                            .addComponent(correoTxt)
                            .addComponent(ComboPrograma, 0, 203, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblVer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(buttonAsignaturas)
                                .addGap(52, 52, 52)
                                .addComponent(buttonHorarios))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(buttonGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addComponent(buttonBuscar)
                                .addGap(35, 35, 35)
                                .addComponent(buttonMatricularAsignatura)))))
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(codigoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccion)
                    .addComponent(direccionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGenero)
                    .addComponent(generoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo)
                    .addComponent(correoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPrograma)
                    .addComponent(ComboPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonGuardar)
                    .addComponent(buttonBuscar)
                    .addComponent(buttonMatricularAsignatura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonAsignaturas)
                    .addComponent(lblVer)
                    .addComponent(buttonHorarios))
                .addGap(21, 21, 21))
        );

        lblRegistroEstudiante.setText("Registro Estudiante");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRegistroEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRegistroEstudiante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRegistrarDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarDepartamentoActionPerformed
        RegistroDepartamento rd = new RegistroDepartamento();
        rd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_buttonRegistrarDepartamentoActionPerformed

    private void buttonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGuardarActionPerformed
        System.out.println("El Estudiante Se registro Correctamente");
        Estudiante e = new Estudiante();
        e.setCodigo(codigoTxt.getText());
        e.setNombre(nombreTxt.getText());
        e.setDireccion(direccionTxt.getText());
        e.setGenero(generoTxt.getText());
        e.setCorreo(correoTxt.getText());
        estudianteList.add(e);
    }//GEN-LAST:event_buttonGuardarActionPerformed

    private void buttonAsignaturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAsignaturasActionPerformed
        boolean aux = false;
        for (int i = 0; i < estudianteList.size(); i++) {
            if (estudianteList.get(i).equals(codigoTxt.getText())) {
                aux = true;
            }
            if (aux = true) {
                System.out.println("");
                if (estudianteList.get(i).getAsignaturaList() == null) {
                    System.out.println("El estudiante No cuenta con ninguna materia Matriculada");
                } else {
                    System.out.println("Materias Matriculadas: " + estudianteList.get(i).getAsignaturaList());
                }
            } else {
                System.out.println("El estudiante ingresado no Existe");
            }
        }
    }//GEN-LAST:event_buttonAsignaturasActionPerformed

    private void buttonMatricularAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMatricularAsignaturaActionPerformed
        

        for (int i = 0; i <= programaList.size(); i++) {
            if (programaList.get(i).getNombre() == "Ingenieria De Sistemas") {
                JOptionPane.showInputDialog("Seleccione La Asignatura que desea Matricular\n1.", null);
            }
            if (programaList.get(i).getNombre() == "Licenciatura En Matematicas") {

            }
            if (programaList.get(i).getNombre() == "Ingenieria Ambiental") {

            }
        }


    }//GEN-LAST:event_buttonMatricularAsignaturaActionPerformed

    private void buttonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarActionPerformed
        boolean aux = false;
        for (int i = 0; i < estudianteList.size(); i++) {
            if (estudianteList.get(i).equals(codigoTxt.getText())) {
                aux = true;
            }
            if (aux = true) {
                System.out.println("El Estudiante ya esta reguistrado");
            }
            if (aux = false) {
                System.out.println("El Estudiante no Existe");
            }
        }
    }//GEN-LAST:event_buttonBuscarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboPrograma;
    private javax.swing.JButton buttonAsignaturas;
    private javax.swing.JButton buttonBuscar;
    private javax.swing.JButton buttonGuardar;
    private javax.swing.JButton buttonHorarios;
    private javax.swing.JButton buttonMatricularAsignatura;
    private javax.swing.JButton buttonRegistrarDepartamento;
    private javax.swing.JTextField codigoTxt;
    private javax.swing.JTextField correoTxt;
    private javax.swing.JTextField direccionTxt;
    private javax.swing.JTextField generoTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPrograma;
    private javax.swing.JLabel lblRegistroEstudiante;
    private javax.swing.JLabel lblVer;
    private javax.swing.JTextField nombreTxt;
    // End of variables declaration//GEN-END:variables
}
