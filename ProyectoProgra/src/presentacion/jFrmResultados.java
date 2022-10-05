

package presentacion;

import static presentacion.ProyectoProgra.resultados;


public class jFrmResultados extends javax.swing.JFrame {

    boolean boton1 = false, boton2 = false, boton3 = false;
    
    public jFrmResultados() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnClasificacionGeneral = new javax.swing.JButton();
        jBtnClasificacionEquipos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTxtResultados = new javax.swing.JTextArea();
        jBtnGanadores = new javax.swing.JButton();
        jBtnClasificacionCategoria = new javax.swing.JButton();
        jBtnSalir = new javax.swing.JButton();
        jBtnReiniciarSimulador = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jBtnClasificacionGeneral.setText("Clasificacion General");
        jBtnClasificacionGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnClasificacionGeneralActionPerformed(evt);
            }
        });

        jBtnClasificacionEquipos.setText("Clasificacion por Equipos");
        jBtnClasificacionEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnClasificacionEquiposActionPerformed(evt);
            }
        });

        jTxtResultados.setColumns(20);
        jTxtResultados.setRows(5);
        jScrollPane1.setViewportView(jTxtResultados);

        jBtnGanadores.setText("GANADORES");
        jBtnGanadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGanadoresActionPerformed(evt);
            }
        });

        jBtnClasificacionCategoria.setText("Clasificacion por Categoria");
        jBtnClasificacionCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnClasificacionCategoriaActionPerformed(evt);
            }
        });

        jBtnSalir.setText("Salir");
        jBtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnSalirActionPerformed(evt);
            }
        });

        jBtnReiniciarSimulador.setText("Reiniciar Simulador");
        jBtnReiniciarSimulador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnReiniciarSimuladorActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("RESULTADOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 480, Short.MAX_VALUE)
                .addComponent(jBtnReiniciarSimulador, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jBtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtnClasificacionCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(jBtnClasificacionEquipos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnClasificacionGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnGanadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1)
                        .addGap(82, 82, 82)
                        .addComponent(jBtnClasificacionGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnClasificacionCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnClasificacionEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jBtnGanadores, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnReiniciarSimulador, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnClasificacionGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnClasificacionGeneralActionPerformed
        resultados.ordenar_casificacion_general();
        jTxtResultados.setText(resultados.clasificacion_general());
    }//GEN-LAST:event_jBtnClasificacionGeneralActionPerformed

    private void jBtnClasificacionEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnClasificacionEquiposActionPerformed
        jTxtResultados.setText(resultados.clasificacion_equipos());
    }//GEN-LAST:event_jBtnClasificacionEquiposActionPerformed

    private void jBtnGanadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGanadoresActionPerformed
        jTxtResultados.setText(resultados.imprimir_ganadores());
    }//GEN-LAST:event_jBtnGanadoresActionPerformed

    private void jBtnClasificacionCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnClasificacionCategoriaActionPerformed
        jTxtResultados.setText(resultados.clasificacion_categoria());
    }//GEN-LAST:event_jBtnClasificacionCategoriaActionPerformed

    private void jBtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnSalirActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_jBtnSalirActionPerformed

    private void jBtnReiniciarSimuladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnReiniciarSimuladorActionPerformed
        ProyectoProgra.main(null);
        this.dispose();
    }//GEN-LAST:event_jBtnReiniciarSimuladorActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(jFrmResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrmResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrmResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrmResultados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrmResultados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnClasificacionCategoria;
    private javax.swing.JButton jBtnClasificacionEquipos;
    private javax.swing.JButton jBtnClasificacionGeneral;
    private javax.swing.JButton jBtnGanadores;
    private javax.swing.JButton jBtnReiniciarSimulador;
    private javax.swing.JButton jBtnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTxtResultados;
    // End of variables declaration//GEN-END:variables
}
