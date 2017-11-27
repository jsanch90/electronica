/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_db;


/**
 *
 * @author usuario
 */
public class VistaConsulta extends javax.swing.JFrame {

    /**
     * Creates new form VistaConsulta
     */
    public VistaConsulta() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Partido = new javax.swing.JButton();
        Salir = new javax.swing.JButton();
        bEquipo = new javax.swing.JButton();
        bJugadores1 = new javax.swing.JButton();
        bArbitro1 = new javax.swing.JButton();
        Sancionados = new javax.swing.JButton();
        Pregunta = new javax.swing.JLabel();
        Finalización = new javax.swing.JButton();
        Cancha1 = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(690, 300));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Partido.setBackground(new java.awt.Color(0, 0, 0));
        Partido.setForeground(new java.awt.Color(255, 255, 255));
        Partido.setText("Partido");
        Partido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PartidoActionPerformed(evt);
            }
        });
        getContentPane().add(Partido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 120, 30));

        Salir.setBackground(new java.awt.Color(0, 0, 0));
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setText("Atras");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, 70, -1));

        bEquipo.setBackground(new java.awt.Color(0, 0, 0));
        bEquipo.setForeground(new java.awt.Color(255, 255, 255));
        bEquipo.setText("Equipo");
        bEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEquipoActionPerformed(evt);
            }
        });
        getContentPane().add(bEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 120, 30));

        bJugadores1.setBackground(new java.awt.Color(0, 0, 0));
        bJugadores1.setForeground(new java.awt.Color(255, 255, 255));
        bJugadores1.setText("Jugador");
        bJugadores1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bJugadores1ActionPerformed(evt);
            }
        });
        getContentPane().add(bJugadores1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 120, 30));

        bArbitro1.setBackground(new java.awt.Color(0, 0, 0));
        bArbitro1.setForeground(new java.awt.Color(255, 255, 255));
        bArbitro1.setText("Arbitro");
        bArbitro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bArbitro1ActionPerformed(evt);
            }
        });
        getContentPane().add(bArbitro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 120, 30));

        Sancionados.setBackground(new java.awt.Color(0, 0, 0));
        Sancionados.setForeground(new java.awt.Color(255, 255, 255));
        Sancionados.setText("Sancionados");
        Sancionados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SancionadosActionPerformed(evt);
            }
        });
        getContentPane().add(Sancionados, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 130, 30));

        Pregunta.setFont(new java.awt.Font("Maiandra GD", 1, 36)); // NOI18N
        Pregunta.setForeground(new java.awt.Color(255, 255, 255));
        Pregunta.setText("¿Qué desea ingresar?");
        getContentPane().add(Pregunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 39, 500, 60));

        Finalización.setBackground(new java.awt.Color(0, 0, 0));
        Finalización.setForeground(new java.awt.Color(255, 255, 255));
        Finalización.setText("Finalización");
        Finalización.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalizaciónActionPerformed(evt);
            }
        });
        getContentPane().add(Finalización, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 130, 30));

        Cancha1.setBackground(new java.awt.Color(0, 0, 0));
        Cancha1.setForeground(new java.awt.Color(255, 255, 255));
        Cancha1.setText("Cancha");
        Cancha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cancha1ActionPerformed(evt);
            }
        });
        getContentPane().add(Cancha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 130, 30));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenRegistro.jpg"))); // NOI18N
        Fondo.setText("jLabel2");
        Fondo.setMinimumSize(new java.awt.Dimension(690, 300));
        Fondo.setPreferredSize(new java.awt.Dimension(400, 300));
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        this.setVisible(false);
        Main mn = new Main();
        mn.setVisible(true);
    }//GEN-LAST:event_SalirActionPerformed

    private void bEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEquipoActionPerformed
        VistaRegistroEquipo vistaRegistroE = new VistaRegistroEquipo();
        vistaRegistroE.correr();
        this.setVisible(false);
    }//GEN-LAST:event_bEquipoActionPerformed

    private void bJugadores1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bJugadores1ActionPerformed
        VistaRegistroJugador vistaRegistroJ = new VistaRegistroJugador();
        vistaRegistroJ.correr();
        this.setVisible(false);
    }//GEN-LAST:event_bJugadores1ActionPerformed

    private void SancionadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SancionadosActionPerformed
        VistaIngresarSancionados vis = new VistaIngresarSancionados();
        vis.setVisible(true);
    }//GEN-LAST:event_SancionadosActionPerformed

    private void bArbitro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bArbitro1ActionPerformed
        VistaRegistroArbitro vistaRegistroA = new VistaRegistroArbitro();
        vistaRegistroA.correr();
        this.setVisible(false);
    }//GEN-LAST:event_bArbitro1ActionPerformed

    private void PartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PartidoActionPerformed
        VistaRegistroPartido vistaRegistroP = new VistaRegistroPartido();
        vistaRegistroP.correr();
        this.setVisible(false);
    }//GEN-LAST:event_PartidoActionPerformed

    private void FinalizaciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalizaciónActionPerformed
        VistaPartidoFinal vistaRegistroPF = new VistaPartidoFinal();
        vistaRegistroPF.run();
        this.setVisible(false);

    }//GEN-LAST:event_FinalizaciónActionPerformed

    private void Cancha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cancha1ActionPerformed
        VistaRegistroCancha vrc = new VistaRegistroCancha();
        vrc.correr();
        this.setVisible(false);
        
    }//GEN-LAST:event_Cancha1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void correr()  {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancha1;
    private javax.swing.JButton Finalización;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton Partido;
    private javax.swing.JLabel Pregunta;
    private javax.swing.JButton Salir;
    private javax.swing.JButton Sancionados;
    private javax.swing.JButton bArbitro1;
    private javax.swing.JButton bEquipo;
    private javax.swing.JButton bJugadores1;
    // End of variables declaration//GEN-END:variables
}