/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal.vistas;

//import autores.vistas.VentanaAutores;
import Publicaciones.modelos.GestorPublicaciones;
import autores.modelos.GestorAutores;
import grupos.modelos.Rol;
import grupos.modelos.GestorGrupos;
import grupos.modelos.MiembroEnGrupo;
import idiomas.modelos.GestorIdiomas;
import interfaces.IControladorPrincipal;
import interfaces.IGestorAutores;
import interfaces.IGestorGrupos;
import interfaces.IGestorIdiomas;
import interfaces.IGestorLugares;
import interfaces.IGestorPalabrasClaves;
import interfaces.IGestorPublicaciones;
import interfaces.IGestorTipos;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lugares.modelos.GestorLugares;
import palabrasclaves.modelos.GestorPalabrasClaves;
import principal.controladores.ControladorPrincipal;
import tipos.modelos.GestorTipos;

/**
 *
 * @author mbmnu
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private IControladorPrincipal controlador;
    /**
     * Creates new form Repositorios
     */
    
    
     public VentanaPrincipal(IControladorPrincipal controlador) {
        initComponents();
        this.controlador = controlador;
        
    }
    
//    public VentanaPrincipal(ControladorPrincipal controlador) {
//        initComponents();
//        this.controlador = controlador;
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PalabraBTN = new javax.swing.JButton();
        TiposBTN = new javax.swing.JButton();
        btnAutores = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        PublicBTN = new javax.swing.JButton();
        IdiomasBTN = new javax.swing.JButton();
        LugaresBTN = new javax.swing.JButton();
        GruposBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Repositorios");

        PalabraBTN.setText("Palabras Clave");
        PalabraBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PalabraBTNActionPerformed(evt);
            }
        });

        TiposBTN.setText("Tipos");

        btnAutores.setText("Autores");
        btnAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutoresActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        PublicBTN.setText("Publicaciones");
        PublicBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PublicBTNActionPerformed(evt);
            }
        });

        IdiomasBTN.setText("Idiomas");

        LugaresBTN.setText("Lugares");
        LugaresBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LugaresBTNActionPerformed(evt);
            }
        });

        GruposBTN.setText("Grupos");
        GruposBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GruposBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PalabraBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LugaresBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IdiomasBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TiposBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(GruposBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAutores, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PublicBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(PalabraBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(LugaresBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TiposBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(IdiomasBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnAutores, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GruposBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PublicBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PalabraBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PalabraBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PalabraBTNActionPerformed

    private void btnAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutoresActionPerformed
        controlador.btnAutoresClic(evt);
    }//GEN-LAST:event_btnAutoresActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
         this.controlador.btnSalirClic(evt);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void LugaresBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LugaresBTNActionPerformed
        this.controlador.btnLugaresClic(evt);
    }//GEN-LAST:event_LugaresBTNActionPerformed

    private void GruposBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GruposBTNActionPerformed
        this.controlador.btnGruposClic(evt);
    }//GEN-LAST:event_GruposBTNActionPerformed

    private void PublicBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PublicBTNActionPerformed
        this.controlador.btnPublicacionesClic(evt);
    }//GEN-LAST:event_PublicBTNActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        IGestorIdiomas GI= GestorIdiomas.crear();
        IGestorPalabrasClaves GPC = GestorPalabrasClaves.crear();
        IGestorTipos GT = GestorTipos.crear();
        IGestorLugares GL = GestorLugares.crear();
        IGestorPublicaciones GP = GestorPublicaciones.crear();
        IGestorGrupos GG= GestorGrupos.crear();
        IGestorAutores GA= GestorAutores.crear();
        GA.nuevoAutor(2, "apellido2", "nombre2", "cx1", "clave", "clave");
        GG.nuevoGrupo("nombre1", "descripcion1");
        GG.nuevoGrupo("nombre2", "descripcion2");
        MiembroEnGrupo MEG1 =new MiembroEnGrupo(GA.verAutores().get(0), Rol.COLABORADOR, GG.verGrupos().get(0));
        MiembroEnGrupo MEG2 =new MiembroEnGrupo(GA.verAutores().get(0), Rol.ADMINISTRADOR, GG.verGrupos().get(1));
        List<MiembroEnGrupo> lista = new ArrayList<>();
        lista.add(MEG1);
        lista.add(MEG2);
        GA.agregarGrupos(GA.verAutores().get(0),lista);
        GG.agregarMiembros(GG.verGrupos().get(0), lista);
        GI.nuevoIdioma("Ingles");
        GI.nuevoIdioma("Español");
        GPC.nuevaPalabraClave("HARDWARE");
        GPC.nuevaPalabraClave("SOFTWARE");
        GPC.nuevaPalabraClave("REDES");
        System.out.println(GPC.verPalabrasClaves());
        GT.nuevoTipo("Tesis");
        GT.nuevoTipo("Disertación");
        GL.nuevoLugar("BS AS");
        GL.nuevoLugar("Tucumán");
        GP.nuevaPublicacion("lol", MEG1, LocalDate.EPOCH, GT.verTipos().get(0), GI.verIdiomas().get(0), GL.verLugares().get(0), GPC.verPalabrasClaves(), "enlace", "resumen");
       IControladorPrincipal controlador=new ControladorPrincipal();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GruposBTN;
    private javax.swing.JButton IdiomasBTN;
    private javax.swing.JButton LugaresBTN;
    private javax.swing.JButton PalabraBTN;
    private javax.swing.JButton PublicBTN;
    private javax.swing.JButton TiposBTN;
    private javax.swing.JButton btnAutores;
    private javax.swing.JButton btnSalir;
    // End of variables declaration//GEN-END:variables
}
