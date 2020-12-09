  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autores.vistas;

import autores.controladores.ControladorAMAlumno;
import autores.controladores.ControladorAutores;
import interfaces.IControladorAMAlumno;
import interfaces.IControladorAutores;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;


/**
 *
 * @author mbmnu
 */
public class VentanaAutores extends javax.swing.JDialog {

    private IControladorAutores controlador;
    
    public VentanaAutores(IControladorAutores controlador,java.awt.Frame parent,boolean  modal) {
        super(parent, modal);
        initComponents();
        this.controlador=controlador;
        
//        this.setLocationRelativeTo(null);
//        this.tablaAlumnos.setModel(new ModeloTablaAlumno());
//        this.tablaProfesores.setModel(new ModeloTablaProfesores());
//        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAlumnos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        TxtAlumnoApellido = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtProfesorApellido = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaProfesores = new javax.swing.JTable();
        btnBuscarProfesor = new javax.swing.JButton();
        btnNuevoProfesor = new javax.swing.JButton();
        btnModificarProfesor = new javax.swing.JButton();
        btnBorrarProfesor = new javax.swing.JButton();
        btnBuscarAlumno = new javax.swing.JButton();
        btnNuevoAlumno = new javax.swing.JButton();
        btnModificarAlumno = new javax.swing.JButton();
        btnBorrarAlumno = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnVolverClic = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 455, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 199, Short.MAX_VALUE)
        );

        jInternalFrame2.setVisible(true);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 455, Short.MAX_VALUE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 202, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Autores");
        setResizable(false);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                ventanaObtenerFoco(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        tablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaAlumnos);

        jLabel1.setText("Apellidos:");

        TxtAlumnoApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtAlumnoApellidoKeyPressed(evt);
            }
        });

        jLabel2.setText("Apellidos:");

        TxtProfesorApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtProfesorApellidoActionPerformed(evt);
            }
        });
        TxtProfesorApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtProfesorApellidoKeyPressed(evt);
            }
        });

        tablaProfesores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tablaProfesores);

        btnBuscarProfesor.setText("Buscar");
        btnBuscarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProfesorActionPerformed(evt);
            }
        });

        btnNuevoProfesor.setText("Nuevo");
        btnNuevoProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProfesorActionPerformed(evt);
            }
        });

        btnModificarProfesor.setText("Modificar");
        btnModificarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProfesorActionPerformed(evt);
            }
        });

        btnBorrarProfesor.setText("Borrar");
        btnBorrarProfesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarProfesorActionPerformed(evt);
            }
        });

        btnBuscarAlumno.setText("Buscar");
        btnBuscarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAlumnoActionPerformed(evt);
            }
        });

        btnNuevoAlumno.setText("Nuevo");
        btnNuevoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoAlumnoActionPerformed(evt);
            }
        });

        btnModificarAlumno.setText("Modificar");
        btnModificarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarAlumnoActionPerformed(evt);
            }
        });

        btnBorrarAlumno.setText("Borrar");
        btnBorrarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarAlumnoActionPerformed(evt);
            }
        });

        jLabel3.setText("Profesores:");

        jLabel4.setText("Alumnos:");

        btnVolverClic.setText("Volver");
        btnVolverClic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverClicActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtAlumnoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtProfesorApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnBuscarProfesor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnNuevoAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnModificarAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnBorrarAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(btnBorrarProfesor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnNuevoProfesor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnModificarProfesor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addComponent(jLabel3))
                        .addContainerGap(46, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnVolverClic))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxtProfesorApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProfesor))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnNuevoProfesor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificarProfesor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrarProfesor)
                        .addGap(48, 48, 48)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(btnNuevoAlumno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnModificarAlumno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrarAlumno))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtAlumnoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarAlumno))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolverClic))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnBorrarAlumno() {
        return btnBorrarAlumno;
    }

    public JButton getBtnBorrarProfesor() {
        return btnBorrarProfesor;
    }

    public JButton getBtnBuscarAlumno() {
        return btnBuscarAlumno;
    }

    public JButton getBtnBuscarProfesor() {
        return btnBuscarProfesor;
    }

    public JButton getBtnModificarAlumno() {
        return btnModificarAlumno;
    }

    public JButton getBtnModificarProfesor() {
        return btnModificarProfesor;
    }

    public JButton getBtnNuevoAlumno() {
        return btnNuevoAlumno;
    }

    public JButton getBtnNuevoProfesor() {
        return btnNuevoProfesor;
    }
    
    
    private void btnNuevoProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProfesorActionPerformed
        this.controlador.btnNuevoProfesorClic(evt);
    }//GEN-LAST:event_btnNuevoProfesorActionPerformed

    private void btnNuevoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoAlumnoActionPerformed

        controlador.btnNuevoAlumnoClic(evt);
    }//GEN-LAST:event_btnNuevoAlumnoActionPerformed

    private void btnVolverClicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverClicActionPerformed
        controlador.btnVolverClic(evt);
    }//GEN-LAST:event_btnVolverClicActionPerformed

    private void btnModificarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProfesorActionPerformed
        controlador.btnModificarProfesorClic(evt);
    }//GEN-LAST:event_btnModificarProfesorActionPerformed

    private void btnModificarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarAlumnoActionPerformed
        controlador.btnModificarAlumnoClic(evt);
    }//GEN-LAST:event_btnModificarAlumnoActionPerformed

    private void TxtProfesorApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtProfesorApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtProfesorApellidoActionPerformed

    private void btnBorrarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarAlumnoActionPerformed
this.controlador.btnBorrarAlumnoClic(evt);    }//GEN-LAST:event_btnBorrarAlumnoActionPerformed

    private void ventanaObtenerFoco(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_ventanaObtenerFoco
    controlador.ventanaObtenerFoco(evt);
    }//GEN-LAST:event_ventanaObtenerFoco

    private void btnBorrarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarProfesorActionPerformed
this.controlador.btnBorrarProfesorClic(evt);                                                  
    }//GEN-LAST:event_btnBorrarProfesorActionPerformed

    private void btnBuscarProfesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProfesorActionPerformed
this.controlador.btnBuscarProfesorClic(evt);    }//GEN-LAST:event_btnBuscarProfesorActionPerformed

    private void btnBuscarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAlumnoActionPerformed
this.controlador.btnBuscarAlumnoClic(evt);    }//GEN-LAST:event_btnBuscarAlumnoActionPerformed

    private void TxtAlumnoApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtAlumnoApellidoKeyPressed
        this.controlador.txtApellidosAlumnoPresionarTecla(evt);
    }//GEN-LAST:event_TxtAlumnoApellidoKeyPressed

    private void TxtProfesorApellidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtProfesorApellidoKeyPressed
        this.controlador.txtApellidosProfesorPresionarTecla(evt);
    }//GEN-LAST:event_TxtProfesorApellidoKeyPressed

    public JTextField getTxtAlumnoApellido() {
        return TxtAlumnoApellido;
    }

    public JTextField getTxtProfesorApellido() {
        return TxtProfesorApellido;
    }

    /**
     * @param args the command line arguments
     */
    
    public JTable getTablaAlumnos() {
        return tablaAlumnos;
    }

    public JTable getTablaProfesores() {
        return tablaProfesores;
    }
//    public void actualizar(){
//        ModeloTablaAlumno mta=(ModeloTablaAlumno)this.tablaAlumnos.getModel();
//        mta.actualizar();
//    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtAlumnoApellido;
    private javax.swing.JTextField TxtProfesorApellido;
    private javax.swing.JButton btnBorrarAlumno;
    private javax.swing.JButton btnBorrarProfesor;
    private javax.swing.JButton btnBuscarAlumno;
    private javax.swing.JButton btnBuscarProfesor;
    private javax.swing.JButton btnModificarAlumno;
    private javax.swing.JButton btnModificarProfesor;
    private javax.swing.JButton btnNuevoAlumno;
    private javax.swing.JButton btnNuevoProfesor;
    private javax.swing.JButton btnVolverClic;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTable tablaAlumnos;
    private javax.swing.JTable tablaProfesores;
    // End of variables declaration//GEN-END:variables
}
